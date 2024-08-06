public class PDFDocument extends Document {
    public PDFDocument(String name, int id) {
        super(name, id);
        this.docType = "PDF";
    }

    public PDFDocument() {
        super();
        this.docType = "PDF";
    }

    @Override
    protected float getDocType() {
        return 1.0f;
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading PDF Document: " + this.dName);
    }

    @Override
    protected void writeDocument() {
        System.out.println("Writing PDF Document: " + this.dName);
    }
}
