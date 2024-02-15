package Miscellaneous;

public class SortedArrayDesc {
    public static void main(String[] args) {



    int []arr={3,6,3,12,9,5};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int temp=0;
                if(arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }


            }

            System.out.println(arr[i]);
        }


}}
