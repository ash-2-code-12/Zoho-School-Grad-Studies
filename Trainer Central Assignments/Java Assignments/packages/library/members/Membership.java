package packages.library.members;

public class Membership {
    private String type;
    private double fee;

    public Membership(String type, double fee) {
        this.type = type;
        this.fee = fee;
    }

    // Getters and setters
    public String getType() { return type; }
    public double getFee() { return fee; }
}
