
public class EmployeeTest{
    public static void main(String[] args) {
        Employee empA = new HourlyEmployee("Ashwin Shankar", 1121, 90.0f, 122.0f);
        empA.getEmployeeDetails();
        empA = new SalariedEmployee("Saran Chakaravarthy", 3329, 8, 90000.0f);
        empA.getEmployeeDetails();

        Employee.printEmployeeList();
    }
}