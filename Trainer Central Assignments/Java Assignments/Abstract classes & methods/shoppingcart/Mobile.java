public class Mobile extends ElectronicsProduct {

    public Mobile(String name,  float price, String desc) {
        super(Product.generateProductId("MB-"), name, price, desc);
        this.itemCategory = "Mobile";
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