package Day3;

public class MaximumElementArray {
    public static void main(String[] args) {

        int a[] = {10, 20, 92, 30};
        int max=0;
        int  temp =0;
        for (int i = 0; i < a.length; i++) {
           if(temp<a[i]){
               temp=a[i];
               max=temp;
           }
        }
        System.out.print("" + max);
    }
}