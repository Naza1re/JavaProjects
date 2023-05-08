import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ARRAYLIST {
    public static void main(String[]args){
        ArrayList<Animals> animals = new ArrayList<>();
        Animals rabbit = new Animals(12,"Кобби");
        Animals cat = new Animals(3,"Мурка");
        Animals dog = new Animals(10,"Картель");
        Animals cow = new Animals(16,"Мура");
        Animals bear = new Animals(24,"Мишка");


        animals.add(rabbit);
        animals.add(cat);
        animals.add(dog);
        animals.add(cow);

        animals.set(2,bear);
        printCollection(animals);

    }
    public static void printCollection(ArrayList arrayList){
        Iterator<Animals> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

    }
}
