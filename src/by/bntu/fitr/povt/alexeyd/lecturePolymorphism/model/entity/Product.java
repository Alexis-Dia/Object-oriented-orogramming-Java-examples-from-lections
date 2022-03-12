package by.bntu.fitr.povt.alexeyd.lecturePolymorphism.model.entity;

//todo: refactore warnings and remove unnecessary code
public class Product {

    public static int productAmount;
    private boolean helpChildren;
    private int weight;
    private double price;
    private int id;

    /* static initialization block (it's called only once) */
    static {
        productAmount = 0;
    }

    /* initialization block (it's called every time an object is created)*/
    {
        productAmount++;
    }

    public Product() {}

    public Product(boolean helpChildren, int weight, double price, int id) {
        this.helpChildren = helpChildren;
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public static void increaseCount () {
        productAmount--;
    }

    public boolean isHelpChildren() {
        return helpChildren;
    }

    protected void setHelpChildren(boolean helpChildren) {
        this.helpChildren = helpChildren;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected void vvv () {
        System.out.println("vvv product");
    }

    @Override
    public String toString() {
        return "Product{" +
                "helpChildren=" + helpChildren +
                ", weight=" + weight +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
