public class DocumentsTest {
    public static void main(String[] args) {
        Document doc1 = new PDFDocument("Java 21.pdf", 101);
        execute(doc1);

        doc1 = new TextDocument("Harry Potter.txt", 102);
        execute(doc1);

        doc1 = new ImageDocument("Dog.png", 103);
        execute(doc1);
        
        Document.printDocumentList();
    }

    public static void execute(Document doc){
        doc.getDocumentDetails();
        doc.getDocumentDetails();
        doc.getDocumentDetails();
    }
}
