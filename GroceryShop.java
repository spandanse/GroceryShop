import java.util.Locale;
import java.util.Scanner;

public class GroceryShop {

    // List of items available in the store
    static String[] items = {
            "Rice", "Wheat", "Sugar", "Salt", "Oil",
            "Milk", "Eggs", "Bread", "Butter", "Cheese"
    };

    // Unit prices corresponding to each item
    static float[] prices = {
            45.5f, 38.0f, 55.0f, 20.0f, 120.0f,
            30.0f, 6.0f, 25.0f, 50.0f, 70.0f
    };

    // Available stock for each item
    static int[] stock = {
            50, 40, 60, 100, 30,
            80, 200, 70, 40, 25
    };

    /**
     * Search for an item in the inventory.
     * @param itemName The name of the item to search.
     * @return index position if found, -1 otherwise.
     */
    public static int searchItem(String itemName) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(itemName)) {
                return i;
            }
        }
        return -1; // Not found
    }

    /**
     * Calculate the average price of all items.
     */
    public static float calculateAveragePrice() {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    /**
     * Print all items priced below a given threshold.
     */
    public static void filterItemsBelowPrice(float limit) {
        System.out.println("\nItems priced below " + limit + ":");
        for (int i = 0; i < items.length; i++) {
            if (prices[i] < limit) {
                System.out.println(items[i] + " - " + prices[i] + " Rs");
            }
        }
    }

    /**
     * Apply discount rules on the total bill.
     * @param total The original total bill amount.
     * @return The discounted amount.
     */
    public static float applyDiscount(float total) {
        if (total > 1000) {
            System.out.println("🎉 Discount Applied: 10% off");
            return total * 0.90f;
        } else if (total > 500) {
            System.out.println("🎉 Discount Applied: 5% off");
            return total * 0.95f;
        }
        return total;
    }

    /**
     * Display available items with their prices and stock.
     */
    public static void displayInventory() {
        System.out.println("\nAvailable Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " Rs (Stock: " + stock[i] + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("======================================");
        System.out.println("    Welcome to the Grocery Shop App    ");
        System.out.println("======================================");

        // Continuous loop for multiple customers
        while (true) {
            float totalBill = 0;
            displayInventory();

            System.out.println("\nStart shopping...");
            System.out.println("Type 'Complete' to finish your purchase.");
            System.out.println("Type 'Exit' to leave the shop.");

            // Loop for adding items to the current bill
            while (true) {
                System.out.print("\nEnter item name: ");
                String itemName = sc.nextLine();

                if (itemName.equalsIgnoreCase("Exit")) {
                    System.out.println("Thank you for visiting! Goodbye.");
                    return;
                }
                if (itemName.equalsIgnoreCase("Complete")) {
                    break; // Finish this customer's shopping
                }

                int index = searchItem(itemName);
                if (index == -1) {
                    System.out.println("❌ Item not found. Please try again.");
                    continue;
                }

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                sc.nextLine(); // Consume newline

                if (qty > stock[index]) {
                    System.out.println("⚠ Only " + stock[index] + " units available. Adding available stock.");
                    qty = stock[index];
                }

                float itemCost = prices[index] * qty;
                totalBill += itemCost;
                stock[index] -= qty;

                System.out.println("Added " + qty + " x " + items[index] +
                        " @ " + prices[index] + " = " + itemCost + " Rs");
            }

            // Apply discounts and show final bill
            totalBill = applyDiscount(totalBill);
            System.out.println("\n💰 Final Total: " + totalBill + " Rs");

            // Show extra features
            System.out.println("\n--- Shop Insights ---");
            System.out.println("Average Price of Items: " + calculateAveragePrice() + " Rs");
            filterItemsBelowPrice(50);
        }
    }
}