public class Employee{
    String name;
    int id;
    double salary;
    int PhoneNumber;
    public Employee(String name, int id, double salary, int PhoneNumber){
        this.name = name;
        this.id =id;
        this.salary=salary;
        this.PhoneNumber=PhoneNumber;
    }
    public void displayinfo(){
        System.out.println("Employee ID:"+ id);
        System.out.println("Employee Name:"+ name);
        System.out.println("Employee Salary:"+ salary);
        System.out.println("Employee PhoneNumber:"+PhoneNumber);
        
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vikas", 101, 30000.00,9243280);
        emp1.displayinfo();
    }
}