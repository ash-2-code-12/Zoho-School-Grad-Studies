import java.util.ArrayList;
import java.util.Scanner;

public abstract class Document {
    public String dName;
    public int dId;
    public String docType;
    public int wordCount;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Document> documentList = new ArrayList<>();

    public Document(String name, int id) {
        this.dName = name;
        this.dId = id;
        this.wordCount = 0;
        documentList.add(this);
    }

    public Document() {        
        this(Document.getName(), Document.getId());
    }

    public static String getName() {
        System.out.println("Enter name:");
        return Document.sc.nextLine();
    }

    public static int getId() {
        System.out.println("Enter Id:");
        return Document.sc.nextInt();
    }

    public static void printDocumentList() {
        System.out.println("---------------------");
        System.out.println("\nTHE DOCUMENTS LIST:\n");
        for(Document doc : documentList) {
            System.out.println("\tId: " + doc.dId + "\tName: " + doc.dName);
        }
        System.out.println("---------------------");
    }

    protected void getDocumentDetails() {
        System.out.println("Document Details:\n\tName: " + this.dName + "\n\tDocument Id: " + this.dId + "\n\tDocument Type: " + this.docType +
         "\n\tWord Count: " + this.wordCount);
    }
    
    abstract protected float getDocType();
    abstract protected void readDocument();
    abstract protected void writeDocument();
}
