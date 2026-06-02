package classPract;

import java.util.Arrays;

public class ArrShort {
    public static void main(String[] args){
        String[] stud={"Rahuk", "Amit","kunal","Abhay"};

        Arrays.stream(stud)
                .sorted()
                .forEach(System.out::println);
    }
}
