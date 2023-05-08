public class THREAD {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Я главный");


        for(int i = 0;i<10;i++) {
            GO a = new GO();
            Thread pot = new Thread(a);
            pot.start();

        }
        System.out.println("Я главный поток");



    }
}
