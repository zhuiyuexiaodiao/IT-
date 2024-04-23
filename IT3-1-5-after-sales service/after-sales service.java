import java.util.Scanner;

// 订单类
class Order {
    private int orderId;
    private String customerName;
    private String product;
    private boolean hasComplaint;
    private boolean hasDispute;

    public Order(int orderId, String customerName, String product) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.hasComplaint = false;
        this.hasDispute = false;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public boolean hasComplaint() {
        return hasComplaint;
    }

    public void setHasComplaint(boolean hasComplaint) {
        this.hasComplaint = hasComplaint;
    }

    public boolean hasDispute() {
        return hasDispute;
    }

    public void setHasDispute(boolean hasDispute) {
        this.hasDispute = hasDispute;
    }
}

// 售后服务类
class AfterSalesService {
    // 处理客户的订单投诉
    public void handleComplaint(Order order) {
        System.out.println("处理订单投诉：订单号 " + order.getOrderId() + "，客户名 " + order.getCustomerName() + "，产品 " + order.getProduct());
        order.setHasComplaint(true);
        // 具体处理逻辑
    }

    // 处理订单交易中产生的纠纷
    public void handleDispute(Order order) {
        System.out.println("处理订单纠纷：订单号 " + order.getOrderId() + "，客户名 " + order.getCustomerName() + "，产品 " + order.getProduct());
        order.setHasDispute(true);
        // 具体处理逻辑
    }

    // 提供订单换货服务
    public void exchangeProduct(Order order) {
        System.out.println("提供订单换货服务：订单号 " + order.getOrderId() + "，客户名 " + order.getCustomerName() + "，产品 " + order.getProduct());
        // 具体处理逻辑
    }

    // 提供订单退货服务
    public void returnProduct(Order order) {
        System.out.println("提供订单退货服务：订单号 " + order.getOrderId() + "，客户名 " + order.getCustomerName() + "，产品 " + order.getProduct());
        // 具体处理逻辑
    }

    // 检查订单是否有投诉或纠纷
    public void checkOrderStatus(Order order) {
        if (order.hasComplaint()) {
            System.out.println("订单 " + order.getOrderId() + " 存在投诉");
        }
        if (order.hasDispute()) {
            System.out.println("订单 " + order.getOrderId() + " 存在纠纷");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建售后服务对象
        AfterSalesService afterSalesService = new AfterSalesService();

        // 模拟订单信息
        Order order = new Order(12345, "Alice", "Product123");

        // 用户选择需要的售后服务
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择需要的售后服务：");
        System.out.println("1. 处理订单投诉");
        System.out.println("2. 处理订单纠纷");
        System.out.println("3. 提供订单换货服务");
        System.out.println("4. 提供订单退货服务");
        System.out.println("5. 检查订单状态");
        int choice = scanner.nextInt();

        // 根据用户选择执行相应的售后服务
        switch (choice) {
            case 1:
                afterSalesService.handleComplaint(order);
                break;
            case 2:
                afterSalesService.handleDispute(order);
                break;
            case 3:
                afterSalesService.exchangeProduct(order);
                break;
            case 4:
                afterSalesService.returnProduct(order);
                break;
            case 5:
                afterSalesService.checkOrderStatus(order);
                break;
            default:
                System.out.println("无效选择");
        }

        scanner.close();
    }
}
