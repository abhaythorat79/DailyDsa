package classPract;

import java.util.HashMap;
import java.util.Map;

public class mostFrequent {

    public static int Freq(int[] arr) {

        Map<Integer, Integer> fre = new HashMap<>();
         for(int num:arr){

             fre.put(num, fre.getOrDefault(num,0)+1);
         }
         int result=Integer.MAX_VALUE;
         int maxFre=0;

         for(Map.Entry<Integer,Integer> entry:fre.entrySet()){

             int num=entry.getKey();
             int count=entry.getValue();

             if(count >maxFre || (count == maxFre
                     && num < result)){
                 maxFre=count;
                 result=num;
             }
         }
         return result;
    }

    public static void main(String[] args){
        int [] arr={4,2,3,4,9,4,3,3,3,3,7,1,2};
        System.out.print(Freq(arr));
    }
}