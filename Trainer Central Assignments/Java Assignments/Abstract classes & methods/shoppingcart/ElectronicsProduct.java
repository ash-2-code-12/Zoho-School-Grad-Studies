
public abstract class ElectronicsProduct extends Product{
    

    public ElectronicsProduct(String productId, String name, float price, String desc) {
        super(productId, name, price, desc, 0,"Electronics");
        this.productIndex=0;

    }    
    
}
