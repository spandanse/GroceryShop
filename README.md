# Grocery Shop Java Project

## **Project Overview**

The **Grocery Shop** is a console-based Java application that simulates a basic grocery billing system. Users can select items, enter quantities, and the application calculates the **total bill** including **discounts**. The project demonstrates **Java basics**, **arrays**, **loops**, **methods**, and simple **inventory management**.

---

## **Learning Objectives**

After completing this project, you will be able to:

* Work with **arrays** to store items and prices.
* Use **loops** and **conditional statements** to handle user input.
* Implement **methods** for searching, filtering, and calculating totals.
* Apply **basic discounts** and manage inventory stock.
* Use **Scanner** for console input and display output.

---

## **Features**

* **View Inventory:** Display available grocery items with prices and stock.
* **Add Items to Cart:** Choose items and specify quantities.
* **Automatic Stock Update:** Stock is reduced as items are purchased.
* **Discount Application:** 5% discount on total bill > 500, 10% discount on bill > 1000.
* **Calculate Total:** Compute total cost for selected items.
* **Filter Items:** Display items below a specified price.
* **Search Items:** Search inventory for a specific item by name.

---

## **Technologies Used**

* **Java 17** or above
* **Arrays** for storing items, prices, and stock
* **Methods** for modular functionality (search, filter, discount)
* **Scanner** for user input
* **Console output** for interactive menu

---

## **Getting Started**

### **1. Clone the Repository**

```bash
git clone https://github.com/spandanse/GroceryShopJava.git
cd GroceryShopJava
```

### **2. Compile the Java Files**

```bash
javac GroceryShopApp.java
```

### **3. Run the Application**

```bash
java GroceryShopApp
```

---

## **Sample Console Run**

```
======================================
    Welcome to the Grocery Shop App    
======================================

Available Items:
Rice - 45.5 Rs (Stock: 50)
Wheat - 38.0 Rs (Stock: 40)
Sugar - 55.0 Rs (Stock: 60)

Start shopping...
Type 'Complete' to finish your purchase.
Type 'Exit' to leave the shop.

Enter item name: Rice
Enter quantity: 2
Added 2 x Rice @ 45.5 = 91.0 Rs

Enter item name: Sugar
Enter quantity: 1
Added 1 x Sugar @ 55.0 = 55.0 Rs

Enter item name: Complete
🎉 Discount Applied: 5% off
💰 Final Total: 137.7 Rs

--- Shop Insights ---
Average Price of Items: 46.83 Rs
Items priced below 50.0:
Rice - 45.5 Rs
Wheat - 38.0 Rs
```

---

## **Project Structure**

```
GroceryShopProject/
│
├── GroceryShopApp.java  # Main application with menu and logic
└── README.md            # Project documentation
```

---

## **How it Works**

1. User views available inventory with prices and stock.
2. User selects items and enters quantities.
3. The application calculates **item cost**, updates **stock**, and adds to total.
4. Applicable **discounts** are applied automatically.
5. Users can **search items**, **filter by price**, or **view insights**.

---

## **Author**

**Spandan Sen** – B.Tech CSE, STCET (MAKAUT)

---

Do you want me to do that too?
