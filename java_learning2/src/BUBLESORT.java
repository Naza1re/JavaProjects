public class BUBLESORT {


    public static void main(String[] args) {
    int[] arr = new int[]{1,5,3,5,2,7,10,7,54,54,34,42,23,32};

    printarr(arr);
    bublsort(arr);
    System.out.println("");
    printarr(arr);


    }
    public static int[] bublsort(int[] arr){
        boolean IsSorted = false;


        while (!IsSorted){
            IsSorted = true;
            for(int i = 0;i<arr.length-1;i++) {


                if (arr[i] > arr[i + 1]) {
                    IsSorted = false;
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;

                }

            }
        }





        return arr;
    }




    public  static void printarr(int[] arr){

    for(int i = 0;i<arr.length;i++){

        System.out.print("["+arr[i]+"]");
    }
    }



}
