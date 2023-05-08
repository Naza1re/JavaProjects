import java.util.*;

public class Main {
    public static void main(String[] args) {
        example();

        int[] arr = new int[]{2, 5, 3, 1, 24, 7, 66, 343, 65, 76, 23, 45, 64, 64, 765, 568, 756};


        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i]>arr[i+1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i  = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    enum Colors{

        RED("red"),
        VLUE("vlue");
        String name;
        Colors(String name){
            this.name=name;
        }



    }




    public static int BinarySearch(int[] arr,int num){
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
            int middle = (right+left)/2;
            int current = arr[middle];

            if(current == num){
                return middle;
            }
            else if(num>current){
                left=middle+1;
            }
            else
                right = middle-1;

        }
        return -1;

    }

    public static int[] Sorted(int[] arr){
        boolean isSorted = false;

        while (!isSorted){
            isSorted = true;
            for (int i = 0;i<arr.length-1;i++){
                if (arr[i]>arr[i+1]){
                    isSorted = false;
                    int tmp = arr[i];

                    arr[i]=arr[i+1];

                    arr[i+1]=tmp;


                }
            }

        }
        return arr;

    }


    private static int min(int[]arr,int start){

        int minIndex = start;
        int minValue = arr[start];
        for (int i = start+1;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue = arr[i];
                minIndex = i;
            }

        }

        return minIndex;


    }
    public static void example(){
        //HashSetExample();
        //TreesetExample();
        //LinkedHashSetExample();
        //ArrayListExample();
        //LinkedListExample();
        //CompareCollections();
    }

    //SET

    public static void HashSetExample(){

        Car car1 = new Car("BMW");
        Car car2 = new Car("Skoda");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");
        Car car5 = new SuperCar("Supercar");

        Set<Car> cars = new HashSet();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Iterator iterator = cars.iterator();


        while (iterator.hasNext()){
            Car car = (Car) iterator.next();
            //System.out.println(car.GetName());
            car.drive();
        }

    }
    public static void TreesetExample(){

        TreeSet treeSet = new TreeSet();

        treeSet.add(245);
        treeSet.add(225);
        treeSet.add(145);
        treeSet.add(246);
        treeSet.add(345);
        treeSet.add(235);
        treeSet.add(205);

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

    }
    public static void LinkedHashSetExample(){
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(123);
        linkedHashSet.add(456);
        linkedHashSet.add(893);
        linkedHashSet.add(1233);

        Iterator iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //LIST
    public static void ArrayListExample(){
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("Skoda");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("Dacia");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(new Car("Wolkswagen"));

        System.out.println("cars.size() = "+cars.size());
        System.out.println(cars.contains(car2));

        int id = cars.indexOf(car2);
        System.out.println("Index = "+id);

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().GetName());
        }


    }


    public static void LinkedListExample() {
        LinkedList<Car> cars = new LinkedList<>();


        Car car1 = new Car("Skoda");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("Dacia");
        Car car5 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.addFirst(car5);

        Iterator<Car> iterator = cars.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next().GetName());
        }
    }

    private static ArrayList<CarForCompare> cars = new ArrayList<>();

    public static void CompareCollections() {


        CarForCompare car1 = new CarForCompare("BMW", 1980);
        CarForCompare car2 = new CarForCompare("Mersedez", 2000);
        CarForCompare car3 = new CarForCompare("Matiz", 1989);
        CarForCompare car4 = new CarForCompare("BMW", 2013);


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        print();
    }

    public static void print(){
        System.out.println();
        Iterator<CarForCompare> iterator = cars.iterator();

        while (iterator.hasNext()){
            CarForCompare carForCompare = iterator.next();
            System.out.println(carForCompare.GetName());
        }

    }


}