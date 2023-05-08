public class CHOISSORT {
    public static void main(String[] args) {

        int[] arr = new int[]{14,5,1,5,2,5,43,5,42,4,5,98};


        for(int step = 0;step<arr.length;step++){
            int minindex = min(arr,step);
            int tmp =arr[step];
            arr[step] = arr[minindex];
            arr[minindex] = tmp;


        }



        for (int i = 0;i<arr.length;i++){
            System.out.print("["+arr[i]+"]");
        }

    }
    public static int min(int[] arr,int start) {


        int minIndex = start;
        int minValue = arr[start];
        for(int i = start+1;start<arr.length;i++){
            if(arr[i]<minValue){
                minIndex = i;
                minValue = arr[i];
            }
        }


        return minIndex;
    }
}
