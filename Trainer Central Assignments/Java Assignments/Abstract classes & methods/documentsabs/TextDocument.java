public class TextDocument extends Document {
    public TextDocument(String name, int id) {
        super(name, id);
        this.docType = "Text";
    }

    public TextDocument() {
        super();
        this.docType = "Text";
    }

    @Override
    protected float getDocType() {
        return 2.0f;
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading Text Document: " + this.dName);
    }

    @Override
    protected void writeDocument() {
        System.out.println("Writing Text Document: " + this.dName);
    }
}
