package task_1;

public class StreamTwo extends Thread {

    private final Timer timer;
    private final String message;

    public StreamTwo(Timer timer, String message) {
        this.timer = timer;
        this.message = message;
    }

    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            int n;
            try {
                n = timer.last();
                System.out.println(n);
                if (n % 5 == 0)
                    System.out.println(message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
