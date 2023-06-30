class Sample {
    public void display(int num) {
        System.out.println("Display method with int parameter: " + num);
    }

    public void display(String str) {
        System.out.println("Display method with String parameter: " + str);
    }
}

public class Two {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.display(10); // Invokes display(int num) method
        sample.display("Hello"); // Invokes display(String str) method
    }
}
