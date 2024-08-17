package packages.library.members;

public class Member {
    private String name;
    private String memberId;
    private Membership membership;

    public Member(String name, String memberId, Membership membership) {
        this.name = name;
        this.memberId = memberId;
        this.membership = membership;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public Membership getMembership() { return membership; }
}
