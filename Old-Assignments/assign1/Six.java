// package assignments.assign1;
/* WAP to print student details using object. */
public class Six {
    public static void main(String[] args) {
        // String name, long regdNo, String course, String branch, int age, long phoenNo, double cgpa
        Student stud = new Student("Devesh Kumar", 2101020482,"B.tech", "CSE", 21, "8797085011", 8.86);
        
        System.out.println(stud.getName());
        System.out.println(stud.getRegdNo());
        System.out.println(stud.getCourse());
        System.out.println(stud.getBranch());
        System.out.println(stud.getAge());
        System.out.println(stud.getPhoneNo());
        System.out.println(stud.getcgpa());
    }
}
