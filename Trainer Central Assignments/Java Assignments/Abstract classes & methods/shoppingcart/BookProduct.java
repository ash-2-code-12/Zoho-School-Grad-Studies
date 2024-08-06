public abstract class BookProduct extends Product{

    public BookProduct(String productId, String name,  float price, String desc) {
        super(productId, name, price, desc, 2, "Books");
        this.productIndex = 2;
    }
}
