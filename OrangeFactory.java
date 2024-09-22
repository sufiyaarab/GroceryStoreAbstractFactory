//createaproduct utilizing methods from groceryproductfactory
public class OrangeFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        return new Orange();
    }
}