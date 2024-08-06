public class ImageDocument extends Document {
    public ImageDocument(String name, int id) {
        super(name, id);
        this.docType = "Image";
    }

    public ImageDocument() {
        super();
        this.docType = "Image";
    }

    @Override
    protected float getDocType() {
        return 3.0f;
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading Image Document: " + this.dName);
    }

    @Override
    protected void writeDocument() {
        System.out.println("Writing Image Document: " + this.dName);
    }
}
