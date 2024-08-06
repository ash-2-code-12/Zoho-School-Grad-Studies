public class TShirt extends ClothingProduct{

    public TShirt( String name, float price, String desc) {
        super(Product.generateProductId("TS-"), name, price, desc);
        this.itemCategory = "TShirt";
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
