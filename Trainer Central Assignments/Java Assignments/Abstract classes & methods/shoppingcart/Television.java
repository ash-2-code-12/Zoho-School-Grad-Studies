public class Television extends ElectronicsProduct{
    
    public Television(String name,  float price, String desc) {

        super(Product.generateProductId("TV-"), name, price, desc);
        this.itemCategory = "Television";
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
