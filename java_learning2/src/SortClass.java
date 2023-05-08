public class SortClass {

    public static void main(String[] args) {
        int[] arr = new int[]{2,31,312,312,542,6344,141241,14241,412,414};
        printsort(arr);
        System.out.println(" ");
        bublesort(arr);
        printsort(arr);


    }

    public static int[] bublesort(int[] arr){

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;

            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    isSorted = false;
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }


        return arr;
    }
    public static void printsort(int[] arr){

        for(int i = 0;i<arr.length;i++){

            System.out.print("["+arr[i]+"]");
        }


    }






}
