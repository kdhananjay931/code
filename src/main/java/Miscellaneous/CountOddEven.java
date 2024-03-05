package Miscellaneous;

public class CountOddEven {

    public static void main(String[] args) {
        int i =45678;
        String str=Integer.toString(i);
        int even=0;
        int odd=0;

        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);

            int digit=Character.getNumericValue(ch);
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println(even);
        System.out.println(odd);

    }
}
