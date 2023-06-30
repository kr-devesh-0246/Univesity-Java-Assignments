class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Four {
    public static void main(String[] args) {
        MyThread myThreadObj = new MyThread();
        Thread thread = new Thread(myThreadObj);
        thread.start();
    }
}
