public class NonFiction extends BookProduct{

    public NonFiction(String name,  float price, String desc) {
        super(Product.generateProductId("NF-"), name, price, desc);
        this.itemCategory = "Non-Fiction";
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
