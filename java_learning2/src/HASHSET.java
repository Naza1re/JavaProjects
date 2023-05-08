import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String[] args) {


        HashSet<Animals> animals = new HashSet<>();
        Animals rabbit = new Animals(12,"Кобби");
        Animals cat = new Animals(3,"Мурка");
        Animals dog = new Animals(10,"Картель");
        Animals cow = new Animals(16,"Мура");

        animals.add(rabbit);
        animals.add(cat);
        animals.add(dog);
        animals.add(cow);

        printCollection(animals);

    }


    public static void printCollection(HashSet hashSet){
        Iterator<Animals> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

    }
}