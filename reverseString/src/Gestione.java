public class Gestione {

    public static int TOT_DELAY = 0;

    public static void main(String[] args) {

        String string = new String();
        string = InputUtility.inputString("Input: ");
        System.out.println("REVERSE STRING with delay (1000,...,3000) > " + "'" + string + "'\n");

        Thread thread = new Thread(string, 0);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
