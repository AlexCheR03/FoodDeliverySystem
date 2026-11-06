public class Order {
    private int id;
    private User user;
    private Restaurant restaurant;
    private String status;
    private Courier courier;

    public Order(int id, User user, Restaurant restaurant, String status, Courier courier) {
        this.id = id;
        this.user = user;
        this.restaurant = restaurant;
        this.status = status;
        this.courier = courier;
    }
    public int getOrderId() {
        return this.id;
    }
    public User getUser() {
        return this.user;
    }
}
