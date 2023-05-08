public class Chois_sort {
    public static void main(String[]args){
        int[] arr = new int[]{2,4,6,2,3,68,23,143,86,354,25,75,75};

        for(int step = 0;step<arr.length;step++){
            int index =  min(arr,step);

            int tmp = arr[step];
            arr[step] = arr[index];
            arr[index]=tmp;
        }

        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    private static int min(int[] arr,int start){
        int minIndex = start;
        int minValue = arr[start];
        for (int i = start+1;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue= arr[i];
                minIndex = i;
            }
        }
        return minIndex;

    }






}
