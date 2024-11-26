package Theory.recursion;

import java.util.ArrayList;

public class ReturnAllSubsiquentInArrayList {

    static ArrayList<String>  returnAllSubsiquent(String s){

        ArrayList<String> ans=new ArrayList<>();
        if(s.isEmpty()) {
            ans.add("");
            return ans;
        }
        char ch=s.charAt(0);

        ArrayList<String> smallAns=returnAllSubsiquent(s.substring(1));
        for (String ss:smallAns)
        {
            ans.add(ss);
            ans.add(ch+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> res=new ArrayList<>(returnAllSubsiquent(str));
        System.out.println(res);
    }
}
