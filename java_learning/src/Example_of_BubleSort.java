public class Example_of_BubleSort {
    public static void main(String[]args){
        int[] arr = new int[]{2,5,412,42,4,2,53,86,1,53,2,32,54,54};
        System.out.print("[");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+";");
        }
        System.out.println("]");

        boolean isSorted = false;

        while (!isSorted){
            isSorted = true;
            for (int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    isSorted = false;

                    int temp = arr[i];

                    arr[i] = arr[i+1];

                    arr[i+1]= temp;
                }
            }

        }
        System.out.print("[");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+";");
        }
        System.out.println("]");












    }


}
