package org.example.Sort;

public class Sort {

    public static void main(String[] args) throws InterruptedException {


        int[] arr = new int[]{12,41,17,4,5,4514,124,124,124,124,124,124,131,7888,2,4,5};
        printarr(arr);
        System.out.println(" ");
        selectionSort(arr);
        printarr(arr);

    }
    public static int[] selectionSort(int[] sortArr) throws InterruptedException {

        for(int i = 0;i<sortArr.length;i++){

            int pos = i;
            int min =sortArr[i];


            for(int j = i+1;j<sortArr.length;j++){
                if(sortArr[j]<min){
                    pos = j;
                    min = sortArr[j];

                }

            }
            printarr(sortArr);
            System.out.println(" ");
            Thread.sleep(1000);
            sortArr[pos] = sortArr[i];
            sortArr[i]=min;


        }
        return sortArr;



    }


    public static void printarr(int[] arr){


        for(int i = 0;i<arr.length;i++){
            System.out.print("["+arr[i]+"]");
        }


    }
    public static int[] sort(int[] arr){
        boolean issorted = false;
        while (!issorted){
            issorted = true;
            for(int i = 0;i<arr.length-1;i++){

                if(arr[i]>arr[i+1]) {
                    issorted = false;
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;

    }
    public static int[] arr(int[] arr){
        boolean isnormal = false;


        while (!isnormal){
            isnormal = true;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]>arr[i+1]){
                    isnormal = false;
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }

            }


        }
        return arr;

    }


    public static int[] arrsort(int[] arr){

        boolean issorted = false;
        while (!issorted){
            issorted = true;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }

            }



        }
        return arr;



    }

    public double[] sort(double[] arr){

        boolean issorted = false;

        while (!issorted){
            issorted=true;
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    issorted=false;
                    double tmp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i]=tmp;
                }
            }

        }


        return arr;
    }
}
