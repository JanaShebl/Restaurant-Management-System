package restaurantmanagement;


public class Meal {
    private int MealId;
    private String name;
    private double price;

    public Meal(int MealId, String name, double price) {
        this.MealId = MealId;
        this.name = name;
        this.price = price;
    }

    public int getId() { return MealId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }


    public String toFileString() {

        return MealId + "," + name + "," + String.format("%.2f", price);
    }
}