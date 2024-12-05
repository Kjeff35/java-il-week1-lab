## oop-exercise-1
Design a real-world scenario of a factory method design pattern

### Overview
The Factory Method Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This promotes loose coupling by delegating the responsibility of instantiation to the subclasses.

### Real-World Scenario
In this example, we simulate a vehicle manufacturing system where different types of vehicles (e.g., cars, and motorcycles) are produced. Each vehicle type has its own factory responsible for its creation.

### Components:
1. Product Interface:
- Vehicle: Defines the common interface for all vehicles.

2. Concrete Products:
- Car: Implements the Vehicle interface.
- Motorcycle: Implements the Vehicle interface.

3. Creator Abstract Class:
- VehicleFactory: Declares the factory method createVehicle().

4. Concrete Creators:
- CarFactory: Produces Car objects.
- MotorcycleFactory: Produces Motorcycle objects.

5. Client:
- Main: Demonstrates the creation and usage of vehicles using factories.

## oop-exercise-2
Using inner classes for data encapsulation

### Overview
This exercise demonstrates the use of inner classes in Java to encapsulate helper functionality or data that is closely related to the outer class. The example implements a shopping cart system where:
- The outer class ShoppingCart manages cart-level functionality.
- The inner class Item encapsulates individual item details and operations.

### Components
1. Outer Class:
- `ShoppingCart` manages the overall cart details like the cart ID and total amount.
- Contains methods for adding items and calculating the total amount.

2. Inner Class:
- `Item` represents an individual item in the cart.
- Encapsulates item-specific data such as name, price, and quantity.
- Provides a method to calculate the total price for the item.

3. Main Class:
- Demonstrates the example

## oop-exercise-3
Implementing a Generic Method for Data Validation

### Overview
This project demonstrates a simple Java validation framework using functional programming concepts. The framework includes a Validator class that uses a ValidatorPredicate functional interface to validate different types of data based on provided criteria.

### Components
1. Validator:
- A utility class that provides a static method validate to validate data against a given ValidatorPredicate.

2. ValidatorPredicate:
- A functional interface that defines the validate method, which takes an input of type T and returns a boolean indicating whether the data meets the validation criteria.

3. Main:
- The entry point for testing the validation. It demonstrates how to use the Validator class with various types of data and corresponding predicates.

## oop-exercise-5
A simple in-memory cache using ConcurrentHashMap to store key-value pairs with thread safety considerations.

## oop-exercise-6
Process a Collection using Stream API and Custom Comparator

## exception-handling-exercise-1
Handling Checked and Unchecked Exceptions

## exception-handling-exercise-2
Utilizing Nested Try-Catch Blocks

## exception-handling-exercise-3
Releasing Resources with finally Block

## exception-handling-exercise-4
Creating a Custom Exception

## concurrency-exercise-1
Implement a Thread Pool for Image Processing

## concurrency-exercise-2
Leverage ConcurrentHashMap for Thread-Safe Caching

## concurrency-exercise-3
Synchronized Block for Updating a Shared Counter

## concurrency-exercise-4
Deadlock Example and Prevention

