package restaurantmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Customer {

    private int custID;
    private String custName;
    private String phoneNum;
    private String address;
    private int loyaltyPoints;
    private boolean successful;
    private boolean registered; // loyalty program registration
    private static int idCounter;

    static {
        loadLastIdFromFile();
    }

    // ---------- Constructor ----------
    public Customer(String custName, String phoneNum, String address) {
        successful = true; // assume valid initially
        String trimmedName = custName.trim();
        String trimmedPhone = phoneNum.trim();
        String trimmedAddress = address.trim();

        if (trimmedName.matches("[a-zA-Z ]+")) {
            this.custName = trimmedName;
        } else {
            
            successful = false;
        }

        if (trimmedPhone.matches("\\d{11}")) {
            this.phoneNum = trimmedPhone;
        } else {

            successful = false;
        }

        this.address = trimmedAddress;

        if (successful) {
            idCounter++;
            custID = idCounter;
        }

        registered = false;
    }

    // ---------- Setters ----------
    public void setCustID(int custID) {
        this.custID = custID;
    }

    public void setName(String custName) {
        if (custName.matches("[a-zA-Z ]+")) {
            this.custName = custName;
        } else {
            System.out.println("Invalid customer name!");
        }
    }

    public void setPhoneNum(String phoneNum) {
        if (phoneNum.matches("\\d{11}")) {
            this.phoneNum = phoneNum;
        } else {
            System.out.println("Invalid phone number!");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        saveUpdatedPointsToFile();
    }

    // ---------- Registered getter/setter ----------
    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    // ---------- Getters ----------
    public int getCustID() {
        return custID;
    }

    public String getName() {
        return custName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public boolean isSuccessful() {
        return successful;
    }

    // ---------- Display ----------
    public void viewProfile() {
        System.out.println(
                "Customer ID: " + custID
                + "\nName: " + custName
                + "\nPhone Number: " + phoneNum
                + "\nAddress: " + address
                + "\nLoyalty Points: " + loyaltyPoints
                + "\nRegistered: " + registered
        );
    }

    // ---------- LOAD LAST ID ----------
    private static void loadLastIdFromFile() {
        File file = new File("customers.txt");
        if (!file.exists()) {
            idCounter = 0;
            return;
        }

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith("Customer ID:")) {
                    int id = Integer.parseInt(line.replace("Customer ID:", "").trim());
                    if (id > idCounter) {
                        idCounter = id;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------- Save to File ----------
    public void saveToFile() {
        if (!successful) {
            System.out.println("Customer data is invalid. Not saved.");
            return;
        }

        try (FileWriter fw = new FileWriter("customers.txt", true)) {
            fw.write("Customer ID: " + custID + "\n");
            fw.write("Name: " + custName + "\n");
            fw.write("Phone: " + phoneNum + "\n");
            fw.write("Address: " + address + "\n");
            fw.write("Loyalty Points: " + loyaltyPoints + "\n");
            fw.write("Registered: " + registered + "\n"); // NEW
            fw.write("---------------------------\n");
        } catch (Exception e) {
            System.out.println("Error saving customer!");
        }
    }

    // ---------- Check if ID exists ----------
    public static boolean idExists(int targetID) {
        try {
            File file = new File("customers.txt");
            if (!file.exists()) {
                return false;
            }

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith("Customer ID:")) {
                    int id = Integer.parseInt(line.replace("Customer ID:", "").trim());
                    if (id == targetID) {
                        sc.close();
                        return true;
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // ---------- Search customer by ID ----------
    public static String searchCustomerById(int targetId) {
        File file = new File("customers.txt");
        if (!file.exists()) {
            return "No customers file found!";
        }

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String idLine = sc.nextLine().trim();
                if (idLine.isEmpty()) {
                    continue;
                }

                String nameLine = sc.nextLine();
                String phoneLine = sc.nextLine();
                String addressLine = sc.nextLine();
                String pointsLine = sc.nextLine();
                String registeredLine = sc.nextLine(); // NEW
                String separator = sc.nextLine();

                int id = Integer.parseInt(idLine.replace("Customer ID:", "").trim());
                if (id == targetId) {
                    String name = nameLine.replace("Name:", "").trim();
                    String phone = phoneLine.replace("Phone:", "").trim();
                    String address = addressLine.replace("Address:", "").trim();
                    String points = pointsLine.replace("Loyalty Points:", "").trim();
                    String reg = registeredLine.replace("Registered:", "").trim();

                    return "Customer ID: " + id
                            + "\nName: " + name
                            + "\nPhone: " + phone
                            + "\nAddress: " + address
                            + "\nLoyalty Points: " + points
                            + "\nRegistered: " + reg;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error reading file!";
        }

        return "Customer with ID " + targetId + " not found!";
    }

    // ---------- Check if customer is registered ----------
    public static boolean isCustomerRegistered(int targetId) {
        File file = new File("customers.txt");
        if (!file.exists()) {
            return false;
        }

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String idLine = sc.nextLine().trim();
                if (idLine.isEmpty()) {
                    continue;
                }

                sc.nextLine(); // Name
                sc.nextLine(); // Phone
                sc.nextLine(); // Address
                sc.nextLine(); // Loyalty points
                String registeredLine = sc.nextLine(); // NEW
                sc.nextLine(); // separator

                int id = Integer.parseInt(idLine.replace("Customer ID:", "").trim());
                if (id == targetId) {
                    String regValue = registeredLine.replace("Registered:", "").trim();
                    return regValue.equalsIgnoreCase("true");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // ---------- Update registration ----------
    public static void updateCustomerRegistration(int targetId, boolean newStatus) {
        File inputFile = new File("customers.txt");
        File tempFile = new File("customers_temp.txt");

        try (Scanner sc = new Scanner(inputFile); FileWriter fw = new FileWriter(tempFile)) {
            while (sc.hasNextLine()) {
                String idLine = sc.nextLine();
                if (idLine.trim().isEmpty()) {
                    continue;
                }

                String nameLine = sc.nextLine();
                String phoneLine = sc.nextLine();
                String addressLine = sc.nextLine();
                String pointsLine = sc.nextLine();
                String registeredLine = sc.nextLine();
                String separator = sc.nextLine();

                int id = Integer.parseInt(idLine.replace("Customer ID:", "").trim());

                if (id == targetId) {
                    registeredLine = "Registered: " + newStatus;
                }

                fw.write(idLine + "\n");
                fw.write(nameLine + "\n");
                fw.write(phoneLine + "\n");
                fw.write(addressLine + "\n");
                fw.write(pointsLine + "\n");
                fw.write(registeredLine + "\n");
                fw.write(separator + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        }
    }

    // ---------- Existing order counting ----------
    public static int countOrdersByCustomer(int targetCustomerId) {
        int count = 0;

        try (Scanner sc = new Scanner(new File("Order.txt"))) {
            boolean match = false;

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                if (line.startsWith("OrderId is")) {
                    match = false;
                } else if (line.startsWith("CustomerId is")) {
                    try {
                        int cid = Integer.parseInt(line.replace("CustomerId is", "").trim());
                        if (cid == targetCustomerId) {
                            match = true;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid CustomerId format: " + line);
                    }
                } else if (line.startsWith("******************")) {
                    if (match) {
                        count++;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error counting orders: " + e.getMessage());
        }

        return count;
    }

    // ---------- Delete customer ----------
    public static void deleteCustomerById(int targetId) {
        File inputFile = new File("customers.txt");
        File tempFile = new File("customers_temp.txt");

        try (Scanner sc = new Scanner(inputFile); FileWriter fw = new FileWriter(tempFile)) {

            while (sc.hasNextLine()) {
                String idLine = sc.nextLine();

                if (!idLine.startsWith("Customer ID:")) {
                    fw.write(idLine + "\n");
                } else {
                    int id = Integer.parseInt(idLine.replace("Customer ID:", "").trim());

                    String nameLine = sc.nextLine();
                    String phoneLine = sc.nextLine();
                    String addressLine = sc.nextLine();
                    String loyaltyLine = sc.nextLine();
                    String registeredLine = sc.nextLine(); // NEW
                    String dashLine = sc.nextLine();

                    if (id != targetId) {
                        fw.write(idLine + "\n");
                        fw.write(nameLine + "\n");
                        fw.write(phoneLine + "\n");
                        fw.write(addressLine + "\n");
                        fw.write(loyaltyLine + "\n");
                        fw.write(registeredLine + "\n");
                        fw.write(dashLine + "\n");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        }
    }

    public static Customer getCustomerById(int targetId) {
        File file = new File("customers.txt");
        if (!file.exists()) {
            return null; // no file, no customer
        }
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String idLine = sc.nextLine().trim();
                if (idLine.isEmpty()) {
                    continue; // skip empty lines
                }
                String nameLine = sc.nextLine();
                String phoneLine = sc.nextLine();
                String addressLine = sc.nextLine();
                String pointsLine = sc.nextLine();
                String registeredLine = sc.nextLine(); 
                String separator = sc.nextLine();      

                int id = Integer.parseInt(idLine.replace("Customer ID:", "").trim());
                if (id == targetId) {
                    String name = nameLine.replace("Name:", "").trim();
                    String phone = phoneLine.replace("Phone:", "").trim();
                    String address = addressLine.replace("Address:", "").trim();
                    int points = Integer.parseInt(pointsLine.replace("Loyalty Points:", "").trim());

                    Customer c = new Customer(name, phone, address);
                    c.setCustID(id);          
                    c.setLoyaltyPoints(points);
                    c.setRegistered(true);    
                    return c;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // not found
    }

    public static void updateCust(int id, String newName, String newPhone, String newAddress) {
        File original = new File("customers.txt");
        File temp = new File("customers_temp.txt");

        try (
                BufferedReader br = new BufferedReader(new FileReader(original)); FileWriter fw = new FileWriter(temp)) {
            String line;
            boolean targetBlock = false; 

            while ((line = br.readLine()) != null) {

                if (line.startsWith("Customer ID:")) {
                    int foundId = Integer.parseInt(line.replace("Customer ID:", "").trim());
                    targetBlock = (foundId == id);
                    fw.write(line + "\n");
                    continue;
                }

                if (targetBlock) {
                    if (line.startsWith("Name:")) {
                        fw.write("Name: " + newName + "\n");
                        continue;
                    }
                    if (line.startsWith("Phone:")) {
                        fw.write("Phone: " + newPhone + "\n");
                        continue;
                    }
                    if (line.startsWith("Address:")) {
                        fw.write("Address: " + newAddress + "\n");
                        continue;
                    }
                }

                fw.write(line + "\n");

                if (line.startsWith("----------------")) {
                    targetBlock = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (!original.delete()) {
            System.out.println("Could not delete original customers file.");
            return;
        }
        if (!temp.renameTo(original)) {
            System.out.println("Could not rename temp file to customers.txt");
        }
    }

    // ---------- Clear all customers ----------
    public static void clearCustomersFile() {
        try (FileWriter fw = new FileWriter("customers.txt", false)) {
            idCounter = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getRewardsByCustomerId(int customerId) {
    String rewards = "";

    try (BufferedReader br = new BufferedReader(new FileReader("rewards_given.txt"))) {
        String line;

        while ((line = br.readLine()) != null) {

            if (line.startsWith("Customer:")) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(
                        parts[0].replace("Customer:", "").trim()
                );

                if (id == customerId) {
                    String reward = parts[1]
                            .replace("Reward:", "")
                            .trim();

                    rewards += "- " + reward + "\n";
                }
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return rewards.isEmpty() ? "No rewards yet." : rewards;
} 
    private void saveUpdatedPointsToFile() {
    File original = new File("customers.txt");
    File temp = new File("customers_temp.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(original));
         FileWriter fw = new FileWriter(temp)) {

        String line;
        boolean targetBlock = false;

        while ((line = br.readLine()) != null) {

            if (line.startsWith("Customer ID:")) {
                int id = Integer.parseInt(line.replace("Customer ID:", "").trim());
                targetBlock = (id == this.custID);
            }

            if (targetBlock && line.startsWith("Loyalty Points:")) {
                line = "Loyalty Points: " + this.loyaltyPoints;
                targetBlock = false;
            }

            fw.write(line + "\n");
        }

    } catch (Exception e) {
    }
    original.delete();
    temp.renameTo(original);
}


}
