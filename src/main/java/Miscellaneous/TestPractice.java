package Miscellaneous;


class Demo{
    public static void main(String[] args) {

        int i=123;

        String str=Integer.toString(i);
        int sum=0;
        for (int j = 0; j <str.length() ; j++) {
            char ch=str.charAt(j);

            int digit=Character.getNumericValue(ch);

            sum=sum+digit;


        }
        System.out.println(sum);
    }
}







