package Miscellaneous;

public class DuplicateNumber {

    public static void main(String[] args) {

        //List<Integer> arr = Arrays.asList(3, 4 ,5, 4, 6, 7, 7);
          int [] arr=  {3,4 ,5, 4, 6, 7, 7};

        System.out.println("Duplicate elements in the list:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                  break;
                }
            }
        }
    }


}
