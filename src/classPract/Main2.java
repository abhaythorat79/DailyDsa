package classPract;
import java.util.Arrays;


public class Main2 {
    public static void main(String[] args) {

        int[] inpute ={4, 5, 2, 3};
        int[] outpute= new int[inpute.length];

        for(int i=0;i<inpute.length;i++){
            int product=1;

            for(int j=0;j<inpute.length;j++){
                if(i!=j){
                    product=product*inpute[j];
                }
            }
            outpute[i]=product;
        }
        System.out.println(Arrays.toString(outpute));
    }
}
