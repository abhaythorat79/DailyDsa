package classPract;

import java.util.HashSet;
import java.util.Set;

public class LongSubstring {
    public static void main(String[] args){
        String str="aaaahbc";

        Set<Character> set=new HashSet<>();

        int left=0,maxLength=0;
        String longest="";

        for(int right=0; right <str.length();right++){
            while (set.contains(str.charAt(right))){

                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            if(right-left+1 > maxLength){
                maxLength=right - left+1;
                longest=str.substring(left,right+1);

            }
        }
        System.out.println("Longest  substring: "+longest);
        System.out.println("Length: "+maxLength);
    }
}
