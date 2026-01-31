package restaurantmanagement;

import java.io.*;

public class OrderDetails {
    private int mealId;
    private int quantity;
    private String mealName;
    private double mealPrice; 

    public OrderDetails(String mealName, int quantity) {
        this.mealName = mealName;
        this.quantity = quantity;
        getPriceIdFromFile(); 
    }

    /// //////////////////////Methodes////////////////////////////
    public void getPriceIdFromFile() {
        this.mealId = -1;
        this.mealPrice = -1;

        try (BufferedReader br = new BufferedReader(new FileReader("meals.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim()); 

                if (name.equalsIgnoreCase(mealName.trim())) { 
                    this.mealId = id;
                    this.mealPrice = price;
                    break;
                }
            }

            if (this.mealId == -1) {
                System.out.println("Warning: Meal name not found in file!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: meals.txt file not found!");
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    ///////////////////Setters//////////////////////////////////
    private void setMealId(int id) {
        this.mealId = id;
    }
    public void setMealPrice(double price) { 
        this.mealPrice = price;
    }

    /// //////////////////////Getters////////////////////////////
    public int getMealIdFromFile() {
        return mealId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMealName() {
        return mealName;
    }
    public double getMealPrice() { 
        return mealPrice;
    }
}
