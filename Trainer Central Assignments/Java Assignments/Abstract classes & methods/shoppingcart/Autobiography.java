public class Autobiography extends BookProduct{

    public Autobiography(String name,  float price, String desc) {
        super(Product.generateProductId("AB-"), name, price, desc);
        this.itemCategory = "Auto-Biography";
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