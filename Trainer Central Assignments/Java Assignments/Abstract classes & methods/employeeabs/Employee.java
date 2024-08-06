// 1. Change Employee class as abstract and add abstract methods like calculatePay() with concrete methods like getEmployeeDetails(), etc.
//  Extend this abstract class in subclasses - HourlyEmployee and SalariedEmployee.
//  Allow the user to input details of employees and calculate their respective pay using the abstract class reference.

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Employee {
    public String name;
    public int id;
    public String empType;
    public float salary;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Employee> employeeList = new ArrayList<>();



    public Employee(String name, int id){
        this.name = name;
        this.id = id;
        this.salary = 0;
        employeeList.add(this);
    }

    public Employee(){        
        this(Employee.getName(), Employee.getId());
    }

    public static String getName(){
        System.out.println("Enter name :");
        return Employee.sc.nextLine();
    }

    public static int getId(){
        System.out.println("Enter Id : ");
        return Employee.sc.nextInt();
    }

    public static void printEmployeeList(){
        System.out.println("---------------------");
        System.out.println("\nTHE EMPLOYEE LIST : \n");
        for(Employee emp : employeeList){
            System.out.println("\tId : " + emp.id + "\tName : " + emp.name);
        }
        System.out.println("---------------------");
    }

    protected void getEmployeeDetails(){
        System.out.println("Employee Details :\n\tName : " + this.name + "\n\tEmployee Id : " + this.id + "\n\tEmployee Type : " + this.empType +
         "\n\tSalary : " + this.salary);
    }
    
    abstract protected float calculatePay();

    abstract protected String getEmployeeType();

}