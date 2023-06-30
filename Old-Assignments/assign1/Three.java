package assignments.assign1;


public class Three {
    public static void main(String[] args) {
        // With using third variable
        int x = 10; 
        int y = 20; 

        // with third variable
        System.out.println("Before Swapping \nx: 10\ny: 20");

        System.out.println("Without third variable");
        int temp = x; 
        x = y; 
        y = temp; 
        System.out.println("After swapping");
        System.out.println("x: "+x);
        System.out.println("y: "+y);



        // without third variable
        System.out.println("Before Swapping \nx: 20\ny: 10");

        System.out.println("Without third variable");
        x = x+y;  // x = 20+10 = 30 
        y = x-y;  // y = 30-10 = 20
        x = x-y;  // x = 30-20 = 10
        System.out.println("After swapping");
        System.out.println(x);
        System.out.println(y);
    }
}
