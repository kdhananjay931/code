package Theory.StringConcept;

public class CountNoOfPalindrom {

    static boolean isPalindrom(String s){
         int i=0;
         int j=s.length()-1;
        while (i<j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
i++;
j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s="abc";
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {

                if(isPalindrom(s.substring(i, j))){
                    System.out.print(s.substring(i,j));
                    count++;
                }

            }

        }

        System.out.println("\nCount the no od pallindrome " +count);
    }
}
