public class Fiction extends BookProduct{

    public Fiction(String name,  float price, String desc) {
        super(Product.generateProductId("FI-"), name, price, desc);
        this.itemCategory = "Fiction";
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
