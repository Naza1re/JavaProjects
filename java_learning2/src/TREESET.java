import java.util.NavigableSet;
import java.util.TreeSet;

public class TREESET {

    public static void main(String[] args) {
        TreeSet<Integer> arr = new TreeSet<>();

        arr.add(1);
        arr.add(87);
        arr.add(13);
        arr.add(23);
        arr.add(65);
        arr.add(12);
        arr.add(3);


        NavigableSet navset = arr.descendingSet();



        for(Object num:navset){
            System.out.println(num);
        }




    }
}
