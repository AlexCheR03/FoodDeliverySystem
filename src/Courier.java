public class Courier {
    private int id;
    private String name;
    private boolean isFree;
    private double salary;

    public Courier(int id, String name, boolean isFree, double salary) {
        this.id = id;
        this.name = name;
        this.isFree = isFree;
        this.salary = salary;
    }
    public boolean getFree() {
        return this.isFree;
    }
    public void setFree(boolean arg) {
        this.isFree = arg;
    }
    public void switchFree() {
        this.isFree = !isFree;
    }


}
