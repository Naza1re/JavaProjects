import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class object {
    public static void main(String[] args) {
        List<Animals> list = new ArrayList<>();

        Animals dog = new Animals(12,"reks");
        Animals dog1 = new Animals(31,"reks");
        Animals dog2 = new Animals(14,"reks");
        Animals dog3 = new Animals(1,"reks");


        int[] array = new int[]{dog1.getAge(),dog2.getAge(),dog3.getAge(),dog.getAge()};
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        printarr(array);
        sort(array);
        printarr(array);



    }
    public static void printarr(int[] arr) {
        for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
        }

    }

    public static int[] sort(int[] arr){

        boolean issorted = false;
        while (!issorted){
            issorted = true;


            for(int  i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    issorted = false;
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }

            }

        }
        return arr;




    }
}
