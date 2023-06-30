class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is running");
            Thread.sleep(2000); // Simulating some task that takes 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Five {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Check if the thread is alive
        while (myThread.isAlive()) {
            System.out.println("Thread is still alive");
            try {
                Thread.sleep(500); // Wait for 0.5 seconds before checking again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread has completed its execution");
    }
}
