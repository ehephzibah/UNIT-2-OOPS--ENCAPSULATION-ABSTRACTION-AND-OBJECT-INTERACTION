# UNIT-2 OOPS – Encapsulation, Abstraction and Object Interaction

This repository contains Java projects demonstrating core Object-Oriented Programming (OOP) concepts such as Interface, Encapsulation, and Abstraction.

---

##  Projects Included

### 1️. Mini Project – Employee Management (Interface)

This project demonstrates the use of **Interfaces** in Java.

**Concept Used:** Interface  
**Description:**  
An interface defines a contract that classes must implement. In this project, employee operations such as displaying details and calculating salary are defined using an interface and implemented by classes.

**Key Concepts:**
- Interface declaration
- Interface implementation
- Multiple class implementation
- Runtime polymorphism

---

### 2️. Project 1 – Bank Account (Encapsulation)

This project demonstrates **Encapsulation**, which protects data by restricting direct access.

**Concept Used:** Encapsulation  
**Description:**  
Bank account details such as balance are kept private and accessed using public getter and setter methods.

**Key Concepts:**
- Private variables
- Public getter and setter methods
- Data hiding
- Secure data access

**Example:**
```java
private double balance;

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

### 3️. Project 2 – Employee Payroll (Abstraction)

This project demonstrates Abstraction, which hides implementation details and shows only essential features.

Concept Used: Abstraction
Description:
Abstract classes are used to define common employee properties and methods, while subclasses implement specific salary calculations.

Key Concepts:

Abstract class

Abstract methods

Method overriding

Code reusability

Example:

abstract class Employee {
    abstract void calculateSalary();
}
