package classPract;

public class Subs {

    public static void main(String[] args){

        String str="abhy";

        int maxCount=1,count=1;

        String longest ="";

        for(int i=1;i< str.length();i++){

            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else {
                if(count >maxCount){
                    maxCount=count;
                    longest=str.substring(i-count,i);
                }
                count =1;
            }
        }
        if(count > maxCount){
            maxCount=count;
            longest =str.substring(str.length()-count);

        }
        System.out.println("Longest Substring="+longest);
        System.out.println("Length="+maxCount);
    }
}
