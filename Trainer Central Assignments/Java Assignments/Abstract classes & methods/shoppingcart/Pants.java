public class Pants extends ClothingProduct{

    public Pants( String name, float price, String desc) {
        super(Product.generateProductId("PNT-"), name, price, desc);
        this.itemCategory = "Pants";
    }
    
    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
    
    
}
