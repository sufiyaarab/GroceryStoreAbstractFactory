import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, Double> prices = PriceReader.readPrices("prices.txt");
            //read from the database (file with information)
            GroceryProductFactory bananaFactory = new BananaFactory();
            GroceryProductFactory OrangeFactory = new OrangeFactory();
            //create two new factories to create make construction possible
            GroceryProduct banana = bananaFactory.createProduct();
            banana.setPrice(prices.get("Banana"));
            //createabanana and set its price
            GroceryProduct Orange = OrangeFactory.createProduct();
            Orange.setPrice(prices.get("Orange"));
            //createaorange and set its price.
            System.out.println("Banana price: " + banana.getPrice());
            System.out.println("Orange price: " + Orange.getPrice());
            //get price from file to find prices of the products
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}