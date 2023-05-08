public class sort {
    public static void main(String[] args) {

        int[] arr = new int[100];

        for(int i = 0 ;i<arr.length;i++){
            arr[i] = (int) (Math.random()*100);

        }
        printarr(arr);
        sort(arr);
        System.out.println(" ");
        printarr(arr);
    }
    public static void printarr(int[] arr){


        for(int i = 0;i<arr.length;i++){

            System.out.print("["+arr[i]+"]");
        }

    }
    public static int[] sort(int[] arr) {

        boolean IsSorted = false;
        while (!IsSorted){
            IsSorted = true;
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    IsSorted = false;
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=tmp;
                }
            }

        }


     return arr;
    }
}



