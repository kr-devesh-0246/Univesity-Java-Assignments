// package assignments.assign1;

public class Student {
    // attributes(?)
    String name;
    long regdNo;
    String course;
    String branch;
    int age;
    String phoneNo;
    double cgpa;

    // constructor
    public Student(String name, long regdNo, String course, String branch, int age, String phoneNo, double cgpa){
        this.name = name;
        this.regdNo = regdNo;
        this.course = course;
        this.branch = branch;
        this.age = age;
        this.phoneNo = phoneNo;
        this.cgpa = cgpa;
    }
    // methods (like the getters)
    public String getName(){return name;} 
    public long getRegdNo(){return regdNo;} 
    public String getCourse(){return course;} 
    public String getBranch(){return branch;} 
    public int getAge(){return age;} 
    public String getPhoneNo(){return phoneNo;} 
    public double getcgpa(){return cgpa;} 
}