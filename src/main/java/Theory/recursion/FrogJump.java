package Theory.recursion;

public class FrogJump {

    static int minCost(int []h,int index){
        if(index==h.length-1)
            return 0;

        int opt1=Math.abs(h[index]-h[index+1])+minCost(h,index+1);
        if (index==h.length-2)
            return opt1;
        int opt2=Math.abs(h[index]-h[index+2])+minCost(h,index+2);

        return Math.max(opt1,opt2);
    }

    public static void main(String[] args) {
        int []a={10,20,30,40};
        System.out.println(minCost(a,0));
    }
}
