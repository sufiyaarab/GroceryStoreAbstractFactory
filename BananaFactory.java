//create a new banana implementing the groceryproductfactory methods
public class BananaFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        return new Banana();
    }
}