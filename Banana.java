//this class takes methods from GroceryProduct in order to setPrice on orange
public class Banana extends GroceryProduct {
    @Override
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Banana price set to " + this.price);
    }
}
