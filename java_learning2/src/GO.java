public class GO implements Runnable {

    @Override
    public void run() {
        System.out.println("Я побочный поток");
    }
}
