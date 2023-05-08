public class Binar_Search {

    public static void main(String[]args){

        int[] arr = new int[]{-48,-12,-5,-1,0,12,43,64,76,45,21,43,65,76,32,23,87,9};
        int[] sortedarr = BubleSort(arr);
        for (int i = 0;i<sortedarr.length;i++){
            System.out.print(sortedarr[i]+";");
        }
        int SearchIndex = BinarySearch(sortedarr, 87);
        System.out.println(SearchIndex);
    }


    public static int[] BubleSort(int[] arr){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    int temp = arr[i];

                    arr[i] = arr[i + 1];

                    arr[i + 1] = temp;
                }
            }
        }
       return arr;
    }


    private static int BinarySearch(int[] arr,int num){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int middle = (left+right)/2;
            int current = arr[middle];

            if(current == num    )
                return middle;

            else if(current<num)
                left=middle+1;

            else
                right = middle-1;

        }
        return -1;
    }
}
