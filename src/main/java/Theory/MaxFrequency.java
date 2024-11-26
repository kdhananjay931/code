package Theory;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 4, 4, 4, 4, 2, 9};
        Map<Integer, Integer> freq = new HashMap<>();
        for (var e : arr) {
            if (!freq.containsKey(e)) {
                freq.put(e, 1);
            } else {
                freq.put(e, freq.get(e) + 1);
            }
        }
        System.out.println(freq.entrySet());
         int maxFreq=0, keyValue=-1;

         for (var k:freq.keySet() ){
             if(freq.get(k)>maxFreq){
                 maxFreq=freq.get(k);
                 keyValue=k;

             }

         }
         for (var l:freq.entrySet()){
             if(l.getValue()>maxFreq){
                 maxFreq=l.getValue();
                 keyValue=l.getKey();
             }

         }
        System.out.printf("%d has max frequency and it occurs %d times",keyValue,maxFreq);
    }
}