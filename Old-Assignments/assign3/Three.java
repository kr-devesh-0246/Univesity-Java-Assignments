public class Three {
    private int x;
    private int y;

    public Three(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Three obj = new Three(10, 20);
        obj.display();
    }
}
