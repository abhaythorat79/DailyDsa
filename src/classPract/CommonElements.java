package classPract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class CommonElements {

    public static void main(String[] args){

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2= Arrays.asList(4,5,6,7,8,9);

        Set<Integer> set=new HashSet<>(list2);

        List<Integer> common=list1.stream().
                filter(set::contains).
                collect(Collectors.toList());
        System.out.println(common);
    }
}
