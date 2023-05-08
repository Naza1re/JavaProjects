import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ARRAYDECK {
    public static void main(String[]args) throws FileNotFoundException {

        FileOutputStream in = new FileOutputStream(new File("hello"));

    }
    public static void printCollection(ArrayDeque arrayDeque){
        Iterator<Animals> iterator = arrayDeque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getAge());
        }

    }

}
