class OuterClass {
    private class InnerClass {
        private void display() {
            System.out.println("Inside InnerClass");
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class Six {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass(); // Accessing private inner class indirectly
    }
}
