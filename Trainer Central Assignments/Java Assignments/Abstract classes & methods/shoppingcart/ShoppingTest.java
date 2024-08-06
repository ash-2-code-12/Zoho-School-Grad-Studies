import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingTest {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Cart myCart = new Cart();
        int choice = -1;
        ShopItems myShop = getShopItems();


        // myShop.showProducts();
        System.out.println("   Lets start shopping!!!!!!!!\n");

        while(true){        //continue from this
            if(choice == -1){ //get category
                choice = promptCategories(myShop, myCart);
                if(choice==0)break;
            }
            if(choice>0 && choice<=Product.categories.size()){ //get item
                choice = promptCategoryItems(choice-1, myShop, myCart);
                if(choice==-1){
                    continue;
                }
            }//add to cart

        }
        System.out.println("--------------------------\n      Total payable Amount  : " + myCart.billAmount+ "\n-----------------------");
        System.out.println("\nThanks for shopping with us!!!!!!!! Come again !!!!!\n");
    }

    public static int promptCategoryItems(int choice, ShopItems myShop, Cart myCart){
        System.out.println(myShop.productList.get(choice).get(0).category+ " :");
        int count = 1;
        for(Product pdt : myShop.productList.get(choice)){
            System.out.println("    " + count++ + ") " + pdt.name + "\t" + pdt.price);
        }
        System.out.println("    " + count + ") Back.\n--------------------");
        System.out.println("Enter Choice : ");
        int newChoice = sc.nextInt();
        if(newChoice == count)return -1;

        if(newChoice>count){
            System.out.println("----------wrong choice. re-enter--------\n");
            return promptCategoryItems(choice, myShop, myCart);
        }
        myCart.addProduct(myShop.productList.get(choice).get(newChoice-1));
        return promptCategoryItems(choice, myShop, myCart);
        
        
    }

    public static int promptCategories(ShopItems myShop, Cart myCart){

        System.out.println("Product Categories : ");
        int count = 1;
        for(ArrayList<Product> categoryList: myShop.productList){
            System.out.println("    " + count++ + ") " + categoryList.get(0).category );
        }

        System.out.println("    " + count++ + ") show Cart");

        System.out.println("    " + count + ") Check Out");
        
        System.out.println("-----------------------\nEnter your choice : ");
        int choice = sc.nextInt();

        if(choice == count-1){  //handles showcart
            myCart.showCart();
            return promptCategories(myShop, myCart);
        }

        if(choice>count){      //handles wrong input
            System.out.println("------wrong choice re-enter------\n");
            return promptCategories(myShop, myCart);
        }

        return choice!= count? choice : 0; //handles exit

    }
    
    public static ShopItems getShopItems(){
        ShopItems shop1 = new ShopItems();

        Product tv1 = new Television("Samsung Smart Tv", 65000,"Samsung assured, 64 inch, UHD retina Display, \nAndroid 14.2, Google assistant & Alexa enabe=led, \n 3 HDMI ports, 3 USB ports, 2 Type-c ports... ");
        shop1.addPdt(tv1);

        Product tv2 = new Television("Apple Tv", 120000,"Apple certified, 55 inch, 4K HDR Display, \nTV OS, Siri enabled, \n4 HDMI ports, 3 USB ports, 1 Ethernet port, \nDolby Atmos sound, A12 Bionic chip...");
        shop1.addPdt(tv2);

        Product hp1 = new HeadPhones("OnePlus Buds Z2", 5000, "OnePlus certified, In-ear wireless earbuds, \nActive Noise Cancellation, \n30-hour battery life with charging case, \nDual drivers for high-quality sound, \nBluetooth 5.2 connectivity, \nIP55 water and sweat resistance...");
        shop1.addPdt(hp1);

        Product hp2 = new HeadPhones("Sony WH-CH500", 4500,"Sony certified, Over-ear wireless headphones, \n30-hour battery life, \nBluetooth 4.2 connectivity, \nBuilt-in microphone for hands-free calls, \nLightweight and comfortable design, \nCompact foldable for easy storage...");
        shop1.addPdt(hp2);

        Product mb1 = new Mobile("iPhone-15 pro max", 180000, "Apple certified, 6.7 inch Super Retina XDR display, \niOS 17, \nA17 Bionic chip, \nTriple-camera system with Ultra Wide, Wide, and Telephoto lenses, \n5G capable, \nFace ID, \n128GB, 256GB, 512GB, and 1TB storage options, \nWater and dust resistant (IP68), \nAvailable in multiple colors...");
        shop1.addPdt(mb1);

        Product mb2 = new Mobile("Samsung Galaxy S24 Ultra", 140000, "Samsung certified, 6.8 inch Dynamic AMOLED 2X display, \nAndroid 14, \nExynos 2400/Snapdragon 8 Gen 3 chipset (varies by region), \nQuad-camera system with Ultra Wide, Wide, Periscope Telephoto, and DepthVision lenses, \n5G capable, \n128GB, 256GB, 512GB, and 1TB storage options, \nWater and dust resistant (IP68), \nS Pen included, \nAvailable in multiple colors...");
        shop1.addPdt(mb2);

        Product tshirt1 = new TShirt("Polo-Tshirt", 599, "Brand certified, Classic Polo T-shirt, \n100% Cotton, \nShort-sleeve with ribbed collar and cuffs, \nThree-button placket, \nRegular fit for everyday comfort, \nMachine washable, \nAvailable in multiple colors and sizes...");
        shop1.addPdt(tshirt1);

        Product tshirt2 = new TShirt("Full Sleeve T-shirt", 1500, "Brand certified, Classic Full Sleeve T-shirt, \n100% Cotton, \nLong-sleeve with ribbed cuffs, \nCrew neck, \nRegular fit for everyday comfort, \nMachine washable, \nAvailable in multiple colors and sizes...");
        shop1.addPdt(tshirt2);

        Product pant1 = new Pants("Levi's Jeans", 3500, "Levi's certified, Classic fit jeans, \n100% Denim Cotton, \nFive-pocket styling, \nZip fly with button closure, \nStraight leg, \nMachine washable, \nAvailable in various waist sizes and lengths, \nMultiple color options...");
        shop1.addPdt(pant1);

        Product pant2 = new Pants("Park Avenue Trousers", 2800, "Park Avenue certified, Formal trousers, \nPolyester-Viscose blend, \nFlat-front design, \nSide and back pockets, \nZip fly with hook-and-bar closure, \nSlim fit for a tailored look, \nMachine washable, \nAvailable in various waist sizes and lengths, \nMultiple color options...");
        shop1.addPdt(pant2);

        Product shirt1 = new Shirt("Calvin Klein Dress Shirt", 4500, "Calvin Klein certified, Classic dress shirt, \n100% Cotton, \nLong-sleeve with buttoned cuffs, \nPoint collar, \nButton-front closure, \nSlim fit for a tailored look, \nMachine washable, \nAvailable in multiple colors and sizes...");
        shop1.addPdt(shirt1);

        Product shirt2 = new Shirt("Adidas Sports Shirt", 3200, "Adidas certified, Performance sports shirt, \n100% Polyester, \nShort-sleeve with ribbed collar, \nClimalite fabric for moisture management, \nRegular fit for everyday comfort, \nMachine washable, \nAvailable in multiple colors and sizes...");
        shop1.addPdt(shirt2);

        Product fiction1 = new Fiction("To Kill a Mockingbird", 899, "Harper Lee's Pulitzer Prize-winning novel, \nSet in the 1930s Deep South, \nA profound exploration of racial injustice, \nThe story follows young Scout Finch and her father, Atticus, as they navigate moral complexities and societal prejudices...");
        shop1.addPdt(fiction1);

        Product fiction2 = new Fiction("1984", 799, "George Orwell's dystopian classic, \nSet in a totalitarian future where the state controls everything, \nFollows Winston Smith's struggle against a repressive regime, \nA chilling exploration of surveillance, propaganda, and individual freedom...");
        shop1.addPdt(fiction2);

        Product nonFiction1 = new NonFiction("Sapiens: A Brief History of Humankind", 1099, "Yuval Noah Harari's global bestseller, \nExplores the history of humankind from the Stone Age to the present, \nOffers insights into how Homo sapiens came to dominate the world, \nA thought-provoking examination of our past and future...");
        shop1.addPdt(nonFiction1);

        Product nonFiction2 = new NonFiction("Educated", 1199, "Tara Westover's memoir, \nA powerful and moving account of growing up in a strict and abusive household in rural Idaho, \nDescribes her journey to education and self-discovery, \nAn inspiring story of overcoming adversity and the pursuit of knowledge...");
        shop1.addPdt(nonFiction2);

        Product autobiography1 = new Autobiography("The Story of My Experiments with Truth", 799, "Mahatma Gandhi's autobiographical work, \nCovers his life from childhood to his role in the Indian independence movement, \nExplores his philosophical and spiritual journey, \nA profound account of his experiments with truth and non-violence...");
        shop1.addPdt(autobiography1);

        Product autobiography2 = new Autobiography("Mein Kampf", 999, "Adolf Hitler's autobiographical manifesto, \nDescribes his political ideology and future plans for Germany, \nProvides insight into his thoughts and motivations, \nA controversial and influential text with significant historical impact...");
        shop1.addPdt(autobiography2);

        return shop1;
        // shop1.showProducts();
    }

}
