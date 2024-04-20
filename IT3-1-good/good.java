import java.util.*;
// 商品类
class Commodity {
    private String name;
    private double price;
    private int quantity;

    public Commodity(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 获取商品名称
    public String getName() {
        return name;
    }

    // 获取商品价格
    public double getPrice() {
        return price;
    }

    // 获取商品数量
    public int getQuantity() {
        return quantity;
    }

    // 设置商品数量
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 输出商品信息
    public void display() {
        System.out.println("商品名称: " + name);
        System.out.println("价格: " + price);
        System.out.println("数量: " + quantity);
    }
}

// 商品管理类
class CommodityManager {
    private List<Commodity> commodities;

    public CommodityManager() {
        commodities = new ArrayList<>();
    }

    // 添加商品
    public void addCommodity(Commodity commodity) {
        commodities.add(commodity);
    }

    // 上架商品
    public void shelveCommodity(String name, double price, int quantity) {
        Commodity commodity = new Commodity(name, price, quantity);
        addCommodity(commodity);
        System.out.println(name + " 上架成功！");
    }

    // 修改商品数量
    public void modifyQuantity(String name, int newQuantity) {
        for (Commodity commodity : commodities) {
            if (commodity.getName().equals(name)) {
                commodity.setQuantity(newQuantity);
                System.out.println(name + " 数量修改成功！");
                return;
            }
        }
        System.out.println("找不到名称为 " + name + " 的商品！");
    }

    // 根据名称检索商品
    public Commodity findCommodityByName(String name) {
        for (Commodity commodity : commodities) {
            if (commodity.getName().equals(name)) {
                return commodity;
            }
        }
        return null;
    }

    // 显示所有商品信息
    public void displayAllCommodities() {
        System.out.println("所有商品信息：");
        for (Commodity commodity : commodities) {
            commodity.display();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CommodityManager manager = new CommodityManager();

        // 上架商品
        manager.shelveCommodity("手机", 1999.99, 100);
        manager.shelveCommodity("电视", 3999.99, 50);

        // 显示所有商品信息
        manager.displayAllCommodities();

        // 修改商品数量
        manager.modifyQuantity("手机", 80);
        manager.modifyQuantity("电视", 40);

        // 显示修改后的商品信息
        manager.displayAllCommodities();

        // 根据名称检索商品
        Commodity foundCommodity = manager.findCommodityByName("手机");
        if (foundCommodity != null) {
            System.out.println("找到商品：" + foundCommodity.getName());
        } else {
            System.out.println("未找到商品！");
        }
    }
}
