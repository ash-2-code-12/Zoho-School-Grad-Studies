public class Shirt extends ClothingProduct{

    public Shirt( String name, float price, String desc) {
        super(Product.generateProductId("SH-"), name, price, desc);
        this.itemCategory = "Shirt";
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
