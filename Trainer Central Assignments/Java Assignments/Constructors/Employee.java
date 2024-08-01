import java.util.ArrayList;

public class Employee {
    private String name;
    private String employeeId;
    private String position;
    private String joinDate;
    private float salaryPerMonth;

    private static int employeeCount = 0;

    public Employee(String name, String employeeId, String position, String joinDate, float salaryPerMonth) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.joinDate = joinDate;
        this.salaryPerMonth = salaryPerMonth;
        employeeCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.employeeId = empId;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setSalary(float salary){
        this.salaryPerMonth = salary;
    }

    public static int getCount(){
        return employeeCount;
    }

    public void getDetails(){
        System.out.println("Details : \n Name : " + this.name + "\n Employee Id: " + this.employeeId + "\n Position : " + this.position + "\n Salary : " + this.salaryPerMonth + "\n Join Date : " + this.joinDate );
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", "E001", "Manager", "2020-01-15", 5000));
        employees.add(new Employee("Jane Smith", "E002", "Developer", "2019-03-22", 4500));
        employees.add(new Employee("Mike Johnson", "E003", "Analyst", "2021-06-30", 4000));

        for (Employee employee : employees) {
            employee.getDetails();
        }

        System.out.println("Total number of employees: " + Employee.getCount());
    }
}
