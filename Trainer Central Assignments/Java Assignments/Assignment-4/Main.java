// 3. Create a Main class with a main method to test the Person class by creating objects using each constructor and printing their details.
public class Main {
    public static void main(String[] args) {
        Person sivaPrakash  = new Person("Siva Prakash");
        Person surya = new Person("Surya", 22);
        Person ashwin = new Person("Ashwin",21,"11, 4th Main Rd, Gandhinagar, Adayar, ch-20");

        sivaPrakash.getDetails();
        surya.getDetails();
        ashwin.getDetails();

    }
}
