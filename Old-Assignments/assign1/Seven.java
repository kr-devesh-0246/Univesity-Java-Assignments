// package assignments.assign1;

/*WAP for calculator to perform addition, subtraction, multiplication,
division using member function and object. */

public class Seven {
    public static void main(String[] args) {

        double num1 = 10.00;
        double num2 = 10.00;

        MyCalculator obj = new MyCalculator(num1, num2);

        System.out.println(obj.addNumbers());
        System.out.println(obj.subNumbers());
        System.out.println(obj.mulNumbers());
        System.out.println(obj.divNumbers());


        // double sum = obj.addNumbers();
        // double sub = obj.subNumbers();
        // double mul = obj.mulNumbers();
        // double div = obj.divNumbers();

        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mul);
        // System.out.println(div);

    }
}
