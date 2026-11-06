import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<MenuItem> menu;
    private ArrayList<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        menu = new ArrayList<MenuItem>();
        orders = new ArrayList<Order>();
    }
}
