public class HeadPhones extends ElectronicsProduct {

    public HeadPhones(String name,  float price, String desc) {
        super(Product.generateProductId("HP-"), name, price, desc);
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
