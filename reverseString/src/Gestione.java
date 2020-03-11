public class Gestione {

    public static int TOT_DELAY = 0;
    public static final String STR = "Milano";

    public static void main(String[] args) {

        System.out.println("REVERSE STRING with delay (1000,...,3000) > " + "'" + STR + "'\n");

        Thread thread = new Thread(STR, 0);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
