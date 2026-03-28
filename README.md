# Grocery Shop Java Project (OOP Version)

## Project Overview

The **Grocery Shop** is a console-based Java application that simulates a grocery billing system using **Object-Oriented Programming (OOP)** principles.

Users can select items, enter quantities, and the system calculates the **total bill with discounts**, while managing **inventory dynamically**.

This project demonstrates **Java fundamentals**, **OOP design**, and **modular programming**.

---

## Learning Objectives

After completing this project, you will be able to:

* Apply **Object-Oriented Programming concepts** (Encapsulation, Abstraction)
* Design real-world systems using **classes and objects**
* Use **ArrayList** for dynamic data handling
* Implement **modular architecture** using multiple classes
* Handle **user input and control flow**
* Build a **scalable and maintainable system design**

---

## Features

* View Inventory – Display items with price and stock
* Add Items to Cart – Select items and quantity
* Automatic Stock Update – Inventory updates after purchase
* Discount System

  * 5% discount for bill > 500
  * 10% discount for bill > 1000
* Billing System – Calculates total cost
* Search Items – Case-insensitive item search
* Filter Items – Display items below a given price
* Shop Insights – Average price calculation

---

## OOP Design

The project is structured using multiple classes:

### Item

* Represents a grocery item
* Contains: name, price, stock
* Demonstrates encapsulation

### Shop

* Manages inventory
* Handles:

  * Search
  * Display
  * Filtering
  * Average price calculation

### Billing

* Handles:

  * Item addition
  * Total calculation
  * Discount logic

### GroceryShopOOP (Main Class)

* Handles user interaction
* Controls application flow

---

## Technologies Used

* Java 17
* Object-Oriented Programming (Encapsulation, Abstraction, Modularity)
* ArrayList
* Scanner (for input)
* Console-based interface

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/spandanse/GroceryShopJava.git
cd GroceryShopJava
```

### 2. Compile

```bash
javac GroceryShopOOP.java
```

### 3. Run

```bash
java GroceryShopOOP
```

---

## Project Structure

```
GroceryShopProject/
│
├── Item.java
├── Shop.java
├── Billing.java
├── GroceryShopOOP.java
└── README.md
```

---

## How it Works

1. The system loads inventory into an ArrayList of Item objects
2. User selects items and quantity
3. The Billing class calculates total and applies discounts
4. Stock is automatically updated
5. Additional insights like average price and filtered items are displayed

---

## Future Improvements

* Convert into GUI or web application
* Integrate MySQL database
* Add user authentication system
* Improve performance using HashMap
* Add billing history and reports

---

## Author

Spandan Sen
B.Tech CSE, STCET (MAKAUT)

---
