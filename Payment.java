package restaurantmanagement;

import java.io.*;
import java.time.LocalDateTime;

public class Payment {
    private final Order order;
    private boolean paymentStatus;
    private String paymentMethod;
    private LocalDateTime paymentTime;
    private static final String FILE_NAME = "payments.txt";

    public Payment(Order order) {
        this.order = order;
        this.paymentStatus = false;
        this.paymentMethod = "NONE"; // CASH , VISA
    }


///////////////////////////methods/////////////////////////////
    public boolean pay(String method) {
        if (!paymentStatus && (method.equals("CASH") || method.equals("VISA"))) {
            this.paymentMethod = method;
            this.paymentStatus = true;
            this.paymentTime = LocalDateTime.now();
            saveToFile();
            return true;
        }
        return false;
    }

//////////////////////////getters///////////////////////////////
    /// @return /
    public double getFinalPrice() {
        return order.getTotalPrice() * 1.14; // Calculate tax
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }


////////////////////////////files/////////////////////////////////
private void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
        writer.println("OrderID: " + order.getOrderId());
        writer.println("CustomerID: " + order.getCustomerId());
        writer.println("SubTotal: $" + String.format("%.2f", order.getTotalPrice()));
        writer.println("Total After Tax: $" + String.format("%.2f", getFinalPrice()));
        writer.println("Method: " + paymentMethod);
        writer.println("Time: " + paymentTime);
        writer.println("-".repeat(40));
        writer.println();
        
    } catch (IOException e) {
        System.out.println("Error saving payment: " + e.getMessage());
    }

    }
}