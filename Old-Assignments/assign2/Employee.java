package assignments.assign2;

public class Employee {
    
    // attributes
    private String empName;
    private int empId;
    private String designation;
    private int salary;
    private String contactNo;

    // constructor
    public Employee(String empName, int empId, String designation, int salary, String contactNo) {
        this.empName = empName;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
        this.contactNo = contactNo;
    }
    // getter methods
    public String getEmpName() {return empName;}
    public int getEmpId() {return empId;}
    public String getDesignation() {return designation;}
    public int getSalary() {return salary;}
    public String getContactNo() {return contactNo;}
}
