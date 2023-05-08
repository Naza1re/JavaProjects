import java.util.LinkedList;

public class Queue {
    public static void main(String []args){
        java.util.Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }





}
