package Theory.StringConcept;

public class ToggleByUsingString {
    public static void main(String[] args) {
        String s="PhYSics";
        for (int i = 0; i <s.length() ; i++) {

            boolean flag=true; //capital
            char ch=s.charAt(i);
            int asci=(char)ch;
            if(asci>=97) flag=false; //samll
            if(flag==true) {
                asci += 32;
                char dh=(char) asci;
               s= s.substring(0,i)+ dh+s.substring(i+1);
            }
            else {
                asci +=-32;
                char dh=(char) asci;
                s= s.substring(0,i)+ dh+s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
