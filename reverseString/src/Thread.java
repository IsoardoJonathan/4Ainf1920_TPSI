import java.util.Random;

public class Thread extends java.lang.Thread {

    public static final int MIN_DELAY = 1000;
    public static final int MAX_DELAY = 3000;

    private String string;
    private int index;

    public Thread(String string, int index) {
        this.string = string;
        this.index = index;
    }

    public void run() {

        if (index < string.length()-1) {
            Thread thread = new Thread(string, index + 1);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Random rand = new Random();
        int delay = rand.nextInt((MAX_DELAY - MIN_DELAY) + 1) + MIN_DELAY;
        try {
            sleep(delay);
            Gestione.TOT_DELAY += delay;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}