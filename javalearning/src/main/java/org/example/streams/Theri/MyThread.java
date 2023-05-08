package org.example.streams.Theri;

public class MyThread implements Runnable{


    public static void main(String[] args) {
        MyThread a = new MyThread();
        Thread b = new Thread(a);
        Thread c = new Thread(a);
        b.setName("Альфа");
        c.setName("Браво");
        b.start();
        c.start();


    }
    @Override
    public void run() {
        for(int i = 0;i<5;i++){

            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            String threadnow = Thread.currentThread().getName();
            System.out.println("Сейчас работает поток по именем : "+ threadnow);
        }

    }

}
