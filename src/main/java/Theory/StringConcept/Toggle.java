package Theory.StringConcept;

public class Toggle {

    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("pHySIcs");
        for (int i = 0; i < str.length(); i++) {

            boolean flag=true;  //capital
            char ch= str.charAt(i);
            int asci=(int)ch;
            if(ch==' ')
                continue;
            if(asci>=97) flag=false; //small
            if(flag==true) {
                asci += +32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
            else {
                asci +=-32;
                char dh=(char) asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);

    }
}
