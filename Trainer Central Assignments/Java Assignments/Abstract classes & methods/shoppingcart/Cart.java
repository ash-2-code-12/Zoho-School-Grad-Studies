import java.util.ArrayList;

public class Cart {
    ArrayList<Product> cart = new ArrayList<>();
    float billAmount = 0.0f;

    public void addProduct(Product curr){  

        billAmount += curr.price;
        
        int indexOfCurr = getIndexOfProduct(curr);

        if(indexOfCurr == -1){
            cart.add(curr);
            System.out.println("\n----added "+ curr.name+"----\n");
        }
        else{
            cart.get(indexOfCurr).pdtCount++;
            System.out.println("\n----added "+ curr.name+"----\n");
        }

    }

    public void removeProduct(Product curr){
        int indexOfCurr = getIndexOfProduct(curr);
        cart.get(indexOfCurr).pdtCount--;
        System.out.println("\n-----removed "+curr.name+"------\n");
        billAmount += curr.price;
    }

    public int getIndexOfProduct(Product curr){
        
        if(cart.size()==0)return -1;
        for(int i=0; i<cart.size(); i++){
            if((cart.get(i)).name == curr.name){
                return i;
            }
        }
        return -1;

    }

    public void showCart(){
        if(cart.size()==0){
            System.out.println("\n\n----No Items in Cart----\n\n");
            return;
        }
        System.out.println("The Cart : ");
        for(Product pdt: cart){
            System.out.println("    " + pdt.name + " x" + pdt.pdtCount + ": " + (pdt.pdtCount*pdt.price) );
        }
        System.out.println("---------------------\n              Total Bill Amount  : " + this.billAmount + "             \n-----------------------");
    }


}
