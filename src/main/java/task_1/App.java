package task_1;

public class App {

    public App(int lifetime) throws InterruptedException {

        Timer timer = new Timer();
        StreamOne streamOne = new StreamOne(timer);
        StreamTwo streamTwo = new StreamTwo(timer, "Минуло 5 секунд");

        streamOne.start();
        streamTwo.start();

        Thread.sleep(lifetime * 1000L + 100);

        streamOne.interrupt();
        streamTwo.interrupt();
    }
}
