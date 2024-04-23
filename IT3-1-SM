import java.util.ArrayList;
import java.util.List;

// 商品类
class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 省略 getter 和 setter 方法
}

// 店铺类
class Shop {
    private String name;
    private String description;
    private List<Product> products;

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    // 添加商品
    public void addProduct(Product product) {
        products.add(product);
    }

    // 修改商品信息
    public void updateProductInfo(String productName, double price, int stock) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setPrice(price);
                product.setStock(stock);
                break;
            }
        }
    }

    // 浏览店铺商品
    public List<Product> browseProducts() {
        return products;
    }

    // 用户购买商品
    public boolean purchaseProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (product.getStock() > 0) {
                    product.setStock(product.getStock() - 1);
                    return true; // 购买成功
                } else {
                    return false; // 库存不足
                }
            }
        }
        return false; // 商品不存在
    }
}

// 商家类
class Merchant {
    private String name;
    private Shop shop;

    public Merchant(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    // 修改店铺信息
    public void updateShopInfo(String name, String description) {
        shop.setName(name);
        shop.setDescription(description);
    }

    // 添加商品
    public void addProduct(Product product) {
        shop.addProduct(product);
    }

    // 修改商品信息
    public void updateProductInfo(String productName, double price, int stock) {
        shop.updateProductInfo(productName, price, stock);
    }
}

// 用户类
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // 浏览店铺商品
    public List<Product> browseShopProducts(Shop shop) {
        return shop.browseProducts();
    }

    // 购买商品
    public boolean purchaseProduct(Shop shop, String productName) {
        return shop.purchaseProduct(productName);
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建商家和店铺
        Shop shop = new Shop("MyShop", "Welcome to MyShop!");
        Merchant merchant = new Merchant("John", shop);

        // 商家修改店铺信息
        merchant.updateShopInfo("John's Shop", "Welcome to John's Shop!");

        // 商家添加商品
        Product product1 = new Product("Product 1", 10.0, 100);
        Product product2 = new Product("Product 2", 20.0, 50);
        merchant.addProduct(product1);
        merchant.addProduct(product2);

        // 商家修改商品信息
        merchant.updateProductInfo("Product 1", 12.0, 80);

        // 用户浏览店铺商品
        User user = new User("Alice");
        List<Product> products = user.browseShopProducts(shop);
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice() + ", Stock: " + product.getStock());
        }

        // 用户购买商品
        boolean success = user.purchaseProduct(shop, "Product 1");
        if (success) {
            System.out.println("Purchase successful!");
        } else {
            System.out.println("Purchase failed: Product out of stock.");
        }
    }
}
