package org.example.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QUEUE {

    public static void main(String[] args) {


        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });




        queue.add(1234);
        queue.add(312);
        queue.add(123);
        queue.add(32);
        queue.add(1);
        printColl(queue);



    }
    public static void printColl(Queue queue){

        while (!queue.isEmpty()){
            System.out.println(queue.poll()+" ");
        }
    }
}
