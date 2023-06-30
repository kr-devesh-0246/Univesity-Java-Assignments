// package assignments.assign1;

public class MyCalculator {

    static double num1; 
    static double num2;

    public MyCalculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    //behaviour(Seperate method for each operation)
    public double addNumbers() {
        return num1+num2;
    }
    public double subNumbers() {
        return num1-num2;
    }
    public double mulNumbers() {
        return num1*num2;
    }
    public double divNumbers() {
        return num1/num2;
    }
}
