public abstract class ClothingProduct extends Product{
    
    public ClothingProduct(String productId, String name, float price, String desc) {
        super(productId, name, price, desc, 1, "Clothing");
        this.productIndex = 1;
    }

}
