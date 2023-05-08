import java.util.LinkedList;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Deck {
    public static void main(String[]args){

        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        Car car1 = new Car("BMW");
        Car car2 = new Car("Skoda");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");
        Car car5 = new SuperCar("Supercar");
        Car car6 = new SuperCar("Supercar");


        arrayBlockingQueue.add(car1);
        arrayBlockingQueue.add(car2);
        arrayBlockingQueue.add(car3);
        arrayBlockingQueue.add(car4);
        arrayBlockingQueue.add(car5);
        arrayBlockingQueue.add(car6);



    }
}
