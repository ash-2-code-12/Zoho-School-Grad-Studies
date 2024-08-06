// 2. Create an abstract class named Product with methods like getPrice() and getDescription().
//  Extend the abstract class in classes representing different types of products such as ElectronicsProduct , ClothingProduct , and BookProduct .
//  Display the details of products and calculate the total price in a shopping cart.
// 3. Change 'Movie' class to abstract class and add additional abstract methods in 'Movie' class and define them in the child classes
// 4. Create 'Document' abstract class. Create subclasses like PDFDocument, TextDocument, ImageDocument, etc. Create abstract methods and concrete methods and demonstrate how they work.

import java.util.HashSet;
import java.util.Set;

public abstract class Product{
    public String category;   //have to be set when adding a new category
    public String itemCategory;
    public String productId;
    public float price;
    public String name;
    public String description;
    public int productIndex; //have to be set manually when adding a new category like category
    public byte pdtCount = 1;
    public static Set<String> categories = new HashSet<>();
    public static Set<Integer> ids = new HashSet<>();    

    public Product(String productId, String name, float price, String desc, int index, String category){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = desc;
        this.category = category;
        categories.add(this.category);
    }

    public static String generateProductId(String serial){
        int temp = ((int)(Math.random() * 90000) + 10000);
        while(ids.contains(temp)){
            temp =((int)(Math.random() * 90000) + 10000);
        }
        ids.add(temp);
        return serial + temp;
    }

    public void getInfo(){
        System.out.println("\nProduct Details : ");
        System.out.println("\tId : "+ productId);
        System.out.println("\tName : "+ name);
        System.out.println("\tPrice : "+price);
        System.out.println("\tDescription : "+description);
        System.out.println("\tCategory : " + category);
    }

    public abstract float getPrice();

    public abstract String getDescription();

}