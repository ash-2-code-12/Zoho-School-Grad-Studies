// 1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees 
//  such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
//  Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.

class EmployeeMain{
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(3752,"Sathish Saran","SAP support"),
            new SalariedEmployee(1121,"Ashwin S","Software Engineer-I", 50000, "Night"),
            new HourlyEmployee(7128, "Harish R","Team Lead", 350, 21)
        };
        for(Employee each : employees){
            System.out.println(each.getEmployeeDetails());
        }
    }
}

class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }
    public String getEmployeeDetails(){
        return "Employee {\n\tName : "+name+",\n\tId : "+id+",\n\tRole : "+role+",\n\t}";
    }
}
class HourlyEmployee extends Employee{
    private float hoursWorked;
    private float hourlyPay;

    public HourlyEmployee(int id, String name,String role, double hourlyPay, double hoursWorked ){
        super(id, name, role);
        this.hourlyPay = (float)hourlyPay;
        this.hoursWorked = (float) hoursWorked;
    }
    @Override
    public String getEmployeeDetails(){
        String temp = super.getEmployeeDetails();
        return temp.substring(0,temp.length()-2) + "\tHourly Pay : "+hourlyPay+",\n\tHours Worked : "+hoursWorked+",\n\t}";
    }
}
class SalariedEmployee extends Employee{
    private double salary ;
    private String shift;

    public SalariedEmployee(int id, String name, String role, double salary, String shift){
        super(id, name, role);
        this.salary = salary;
        this.shift = shift;
    }
    @Override
    public String getEmployeeDetails(){
        String temp = super.getEmployeeDetails();
        return temp.substring(0,temp.length()-2) + "\tSalary : "+salary+",\n\tShift : "+shift+",\n\t}";
    }
}
