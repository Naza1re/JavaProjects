package org.example.streams.Theri;

public class Main {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        Thread b = new Thread(a);

        b.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Возвращаемся в галвный поток");
    }

}
