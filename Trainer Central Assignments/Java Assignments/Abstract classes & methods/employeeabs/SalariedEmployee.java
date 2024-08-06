
public class SalariedEmployee extends Employee{
    public int leaveCount;
    public float basePay;
    public static String empType = "Salaried";

    public SalariedEmployee(String name, int id, int leaveCount, float basePay){
        super(name, id);
        
        this.leaveCount = leaveCount;
        this.basePay = basePay;
        this.salary = calculatePay();
    }

    @Override
    protected float calculatePay() {
        return this.leaveCount<4 ? this.basePay : (this.basePay - (this.leaveCount * 500));
    }

    
    @Override
    protected String getEmployeeType() {
        System.out.println(empType);
        return empType;
    }

}
