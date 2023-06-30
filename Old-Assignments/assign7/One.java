class Hii implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Hii");
                Thread.sleep(1000); // Delay of 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Hello");
                Thread.sleep(1000); // Delay of 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class One {
    public static void main(String[] args) {
        Thread hiiThread = new Thread(new Hii());
        Thread helloThread = new Thread(new Hello());

        hiiThread.start();
        helloThread.start();

        try {
            hiiThread.join(2000); // Timeout of 2 seconds
            helloThread.join(2000); // Timeout of 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (hiiThread.isAlive()) {
            hiiThread.interrupt(); // Interrupt the hiiThread if it exceeds the timeout
        }

        if (helloThread.isAlive()) {
            helloThread.interrupt(); // Interrupt the helloThread if it exceeds the timeout
        }
    }
}
