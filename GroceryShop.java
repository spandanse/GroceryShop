import java.util.*;

// Item class (Encapsulation)
class Item {
    private String name;
    private float price;
    private int stock;

    public Item(String name, float price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public float getPrice() { return price; }
    public int getStock() { return stock; }

    public void reduceStock(int qty) {
        stock -= qty;
    }
}

// Shop class (Handles inventory & operations)
class Shop {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Item searchItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void displayInventory() {
        System.out.println("\nAvailable Items:");
        for (Item item : items) {
            System.out.println(item.getName() + " - " +
                    item.getPrice() + " Rs (Stock: " + item.getStock() + ")");
        }
    }

    public float calculateAveragePrice() {
        float sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum / items.size();
    }

    public void filterItemsBelowPrice(float limit) {
        System.out.println("\nItems priced below " + limit + ":");
        for (Item item : items) {
            if (item.getPrice() < limit) {
                System.out.println(item.getName() + " - " + item.getPrice() + " Rs");
            }
        }
    }
}

// Billing class (Handles billing logic)
class Billing {
    private float total = 0;

    public void addItem(Item item, int qty) {
        if (qty > item.getStock()) {
            System.out.println("⚠ Only " + item.getStock() + " units available. Adding available stock.");
            qty = item.getStock();
        }

        float cost = item.getPrice() * qty;
        total += cost;
        item.reduceStock(qty);

        System.out.println("Added " + qty + " x " + item.getName() +
                " @ " + item.getPrice() + " = " + cost + " Rs");
    }

    public float applyDiscount() {
        if (total > 1000) {
            System.out.println("🎉 Discount Applied: 10% off");
            total *= 0.90f;
        } else if (total > 500) {
            System.out.println("🎉 Discount Applied: 5% off");
            total *= 0.95f;
        }
        return total;
    }

    public float getTotal() {
        return total;
    }
}

// Main class (Driver)
public class GroceryShopOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create shop and add items
        Shop shop = new Shop();
        shop.addItem(new Item("Rice", 45.5f, 50));
        shop.addItem(new Item("Wheat", 38.0f, 40));
        shop.addItem(new Item("Sugar", 55.0f, 60));
        shop.addItem(new Item("Salt", 20.0f, 100));
        shop.addItem(new Item("Oil", 120.0f, 30));
        shop.addItem(new Item("Milk", 30.0f, 80));
        shop.addItem(new Item("Eggs", 6.0f, 200));
        shop.addItem(new Item("Bread", 25.0f, 70));
        shop.addItem(new Item("Butter", 50.0f, 40));
        shop.addItem(new Item("Cheese", 70.0f, 25));

        System.out.println("======================================");
        System.out.println("    Welcome to the Grocery Shop App    ");
        System.out.println("======================================");

        while (true) {
            Billing bill = new Billing();
            shop.displayInventory();

            System.out.println("\nStart shopping...");
            System.out.println("Type 'Complete' to finish purchase.");
            System.out.println("Type 'Exit' to leave.");

            while (true) {
                System.out.print("\nEnter item name: ");
                String itemName = sc.nextLine();

                if (itemName.equalsIgnoreCase("Exit")) {
                    System.out.println("Thank you for visiting!");
                    return;
                }

                if (itemName.equalsIgnoreCase("Complete")) {
                    break;
                }

                Item item = shop.searchItem(itemName);
                if (item == null) {
                    System.out.println("❌ Item not found.");
                    continue;
                }

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();

                bill.addItem(item, qty);
            }

            float finalTotal = bill.applyDiscount();
            System.out.println("\n💰 Final Total: " + finalTotal + " Rs");

            System.out.println("\n--- Shop Insights ---");
            System.out.println("Average Price: " + shop.calculateAveragePrice() + " Rs");
            shop.filterItemsBelowPrice(50);
        }
    }
}
