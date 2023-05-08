import java.util.concurrent.Semaphore;

public class Maini {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        new Filosofer(sem,"Сократ").start();
        new Filosofer(sem,"Платон").start();
        new Filosofer(sem,"Аристотель").start();
        new Filosofer(sem,"Фалес").start();
        new Filosofer(sem,"Пифагор").start();
    }
}
