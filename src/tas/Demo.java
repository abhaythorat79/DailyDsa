package tas;

public class Demo {

    public static void main(String[] args){
       int arr[]={1,2,3,4,5,6,7};
       // 5,6,7,1,2,3,4,
        int possi=2;

        int n=arr.length;

        possi=possi%n;

        int result[] =new int[n];

       for(int i=0;i<n;i++){
           result[(i+possi) %n]=arr[i];
       }
       for(int num : result){
           System.out.print(num+ " ");
       }
    }
}
