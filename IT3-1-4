import java.util.HashMap;
import java.util.Map;

// 用户类
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

// 用户管理类
class UserManager {
    private Map<String, User> users;

    public UserManager() {
        this.users = new HashMap<>();
    }

    // 注册新用户
    public void registerUser(String username, String password) {
        User newUser = new User(username, password);
        users.put(username, newUser);
        System.out.println("用户 " + username + " 注册成功！");
    }

    // 用户登录
    public boolean loginUser(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                System.out.println("用户 " + username + " 登录成功！");
                return true;
            }
        }
        System.out.println("用户名或密码错误，登录失败！");
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // 注册新用户
        userManager.registerUser("user1", "password123");
        userManager.registerUser("user2", "abc123");

        // 尝试登录
        userManager.loginUser("user1", "password123"); // 登录成功
        userManager.loginUser("user2", "wrongpassword"); // 登录失败
    }
}
