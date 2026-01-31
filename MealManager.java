
package restaurantmanagement;

import java.io.*;
import java.util.*;

public class MealManager {
    private static final String FILE_PATH = "meals.txt";


    public static List<Meal> readMeals() {
        List<Meal> meals = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");

                if (parts.length < 3) {
                    continue;
                }

                try {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    meals.add(new Meal(id, name, price));
                } catch (NumberFormatException e) {

                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
        return meals;
    }

    public static void writeMeals(List<Meal> meals) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, false))) {
            for (Meal meal : meals) {
                bw.write(meal.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {

        }
    }


    public static boolean addMeal(int id, String name, double price) {
        List<Meal> meals = readMeals();
        for (Meal meal : meals) {
            if (meal.getId() == id) {
                return false;
            }
        }
        meals.add(new Meal(id, name, price));
        writeMeals(meals);
        return true;
    }


    public static boolean deleteMeal(int id) {
        List<Meal> meals = readMeals();
        boolean wasDeleted = meals.removeIf(meal -> meal.getId() == id);

        if (wasDeleted) {
            writeMeals(meals);
        }
        return wasDeleted;
    }

    public static boolean updateMeal(int id, String newName, double newPrice) {
        List<Meal> meals = readMeals();
        boolean found = false;

        for (Meal meal : meals) {
            if (meal.getId() == id) {
                meal.setName(newName);
                meal.setPrice(newPrice);
                found = true;
                break;
            }
        }

        if (found) {
            writeMeals(meals);
        }
        return found;
    }
    public static List<Meal> searchMeal(String query) {
        List<Meal> allMeals = readMeals();
        List<Meal> results = new ArrayList<>();
        String lowerCaseQuery = query.trim().toLowerCase();

        for (Meal meal : allMeals) {

            if (meal.getName().toLowerCase().contains(lowerCaseQuery)) {
                results.add(meal);
                continue;
            }
            try {
                if (meal.getId() == Integer.parseInt(query.trim())) {
                    results.add(meal);
                    continue;
                }
            } catch (NumberFormatException ignored) {}
        }
        return results;
    }
    
}