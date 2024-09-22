# GroceryStoreAbstractFactory
This code implements a system for managing grocery products, specifically bananas and oranges, using the Abstract Factory and Factory Method design patterns
The project has an aim to implement an Abstract Factory to create products for a grocery store while also setting their prices. The prices will be assigned after the products are created, sourced from a database (for this, the database is represented as a file containing product names and their corresponding prices).
PriceReader.java is responsible for reading fruit prices from a specified text file and returning a map of fruit names to their prices. It ensures the file exists and handles file reading operations.
GroceryProduct.java Role is an abstract base class for fruit products, responsible for defining the methods setPrice and getPrice that all concrete product classes must implement.
Banana.java is a concrete implementation of the GroceryProduct class that represents a banana. It provides the implementation for setting the price and printing a confirmation message.
BananaFactory role is a factory class that implements GroceryProductFactory to create instances of the Banana class.
OrangeFactory role is a factory class that implements GroceryProductFactory to create instances of the Orange class (note: you'll need to create the Orange class as it's referenced in Main).
Main role is the entry point of the application. It reads prices from the prices.txt file, creates fruit products using their respective factories, sets their prices, and prints the prices of bananas and oranges.
Expected output is the following:
