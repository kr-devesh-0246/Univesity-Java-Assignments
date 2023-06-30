// I had to replace Person with Three.

public class Three {
    private String name;
    private int age;

    // Parameterized constructor
    public Three(String name, int age) {
        this.name = name; // "this" refers to the current object's name variable
        this.age = age; // "this" refers to the current object's age variable
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Three class using the parameterized constructor
        Three Three = new Three("John Doe", 25);
        Three.display();
    }
}
