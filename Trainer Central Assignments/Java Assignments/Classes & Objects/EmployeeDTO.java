// 2. Create an Employee DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers. Maintain encapsulation by giving controlled access to employee's PII.

public class EmployeeDTO {
    private String name;
    private String employeeId;
    private String position;
    private String joinDate;
    private float salaryPerMonth;

    private static int employeeCount = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        if(empId==null){
            EmployeeDTO.employeeCount++;
        }
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
        System.out.println("Details : \n Name : " + this.name + "\n Employee Id: " + this.employeeId + "\n Position : " + this.position + "\n salary : " + this.salaryPerMonth + "\n Join Date : " + this.joinDate );
    }

}
