package classPract;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main (String[] args){
        Set<String> set=new HashSet<>();

        set.add("java");
        set.add("Spring");
        set.add("Jpa");
        set.add("hibernet");
        set.add("javascript");
        set.add("jpa");

        System.out.println("Size" +set.size());


        System.out.println(set.contains("Java"));

        set.remove("Spring");

        System.out.print(set.isEmpty());

        System.out.print(set);

        for(String s:set){
        System.out.print(s);
    }
        set.clear();
    }

}
