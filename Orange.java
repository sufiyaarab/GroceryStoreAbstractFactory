//this class takes methods from GroceryProduct in order to setPrice on orange
public class Orange extends GroceryProduct {
    @Override
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Orange price set to " + this.price);
    }
}
