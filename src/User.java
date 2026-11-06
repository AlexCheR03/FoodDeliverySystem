public class User {
    private int id ;
    private String name;
    private String phoneNumber;
    private String address;
    private double balance;

    public User(int id, String name, String phoneNumber, String address, double balance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.balance = balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }



}
