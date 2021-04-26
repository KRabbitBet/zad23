package orderPackage;


public class Order {
    private int id;
    private String orderName;
    OrderStatus orderStatus;

    public Order(int id, String orderName, OrderStatus orderStatus){
        this.id = id;
        this.orderName = orderName;
        this.orderStatus = orderStatus;
    }

    public int getId () {
        return id;
    }
    public String getOrderName () {
        return orderName;
    }
    public OrderStatus getOrderStatus () {
        return orderStatus;
    }
}