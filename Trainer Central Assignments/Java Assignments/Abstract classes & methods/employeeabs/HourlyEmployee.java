

public class HourlyEmployee extends Employee {
    
    public int hoursWorked;
    public boolean inWork;
    public float hours;
    public float hourlyPay;
    public static String empType = "Hourly";

    public HourlyEmployee(String name, int empId, float hourlyPay, float hours){
        super(name, empId);
        this.hours = hours; 
        this.hourlyPay = hourlyPay;
        this.salary = calculatePay();
    }

    @Override
    protected float calculatePay() {
        this.salary = this.hourlyPay * this.hours;
        return this.salary;
    }

    @Override
    protected String getEmployeeType() {
        System.out.println(empType);
        return empType;
    }

}
