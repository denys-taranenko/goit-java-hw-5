package task_1;

public class StreamOne extends Thread {

    private final Timer timer;

    public StreamOne(Timer timer) {
        this.timer = timer;
    }

    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            this.timer.add();
        }
    }
}
