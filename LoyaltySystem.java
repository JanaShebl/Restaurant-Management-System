 package restaurantmanagement;

public class LoyaltySystem {

    private static final int pointsPer100 = 10;

    public static void setLoyaltyPoints(Customer customer) {
        if (customer == null) {
            System.out.println("Unable to find customer.");
            return;
        }

        Order order = new Order(); 
        double totalSpent = order.getTotalAmountByCustomerId(customer.getCustID());
        int loyaltyPoints = ((int) (totalSpent / 100)) * pointsPer100;
        customer.setLoyaltyPoints(loyaltyPoints);
    }
}

