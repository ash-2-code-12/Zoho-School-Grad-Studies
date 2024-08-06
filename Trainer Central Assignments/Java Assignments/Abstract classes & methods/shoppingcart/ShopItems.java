import java.util.ArrayList;

public class ShopItems {
    public  ArrayList<ArrayList<Product>> productList = new ArrayList<>();
    
    {                // 3 is hardcoded value indicating number of categories of Product that we will add in this shopitems
                    //  ↑
        for(int i=0; i< 3 ; i++){
            ArrayList<Product> newCategoryList = new ArrayList<>();
            productList.add(newCategoryList);
        }
        
    }

    public void addPdt(Product curr){
        // System.out.println(productList.size());       

        this.productList.get(curr.productIndex).add(curr);
        System.out.println("------"+ curr.name +" added-------");
    }

    public void showProducts(){
        System.out.println("\nProducts : ");
        for(ArrayList<Product> categoryList : productList){
            if(categoryList.size()<=0) continue;
            System.out.println("   "+categoryList.get(0).category+" :");
            for(Product currProduct : categoryList){
                System.out.println("\t" + currProduct.name);
            }
            System.out.println();
        }
    }

    
}
