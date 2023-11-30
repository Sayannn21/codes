class Employee{
    protected String name;
    protected int age;
    public Employee(String n,int a){
        this.name = n;
        this.age = a;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Worker extends Employee{
    private double hoursWorked;
    private double salaryPerHour;

    public Worker(String name,int age,double hoursWorked,double salaryPerHour){
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
    }
    public double cal_Totalsalary(){
        return (hoursWorked*salaryPerHour);
    }
}

class Manager extends Employee{
    private String department;
    private double salary;

    public Manager(String name,int age,String department, double salary){
        super (name, age);
        this.department = department;
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class Employee_Demo_ex22 {
    public static void main(String args[]){
        Worker w = new Worker("Sayan Das", 30, 40.0, 15.0);
        Manager m = new Manager("Sibendu Das", 40, "HR", 60000.0);

        System.out.println("Worker details:");
        w.display();
        System.out.println("Total salary: " + w.cal_Totalsalary() + "Rs");
        System.out.println();
        System.out.println("Manager details: " );
        m.display();

    }
}    
