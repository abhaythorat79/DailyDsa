package classPract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Seating {
    public static void mian(String[] args){

        Map<Integer, String> seatingsMap = new HashMap<>();

        String[] students ={"Abhay", "Amit","Govind","Kunal","Shubham", "Harshad","Akash","Kajal","Arohi",
                "Anita"};
        Set<String> uniqStudent=new HashSet<>();

        for(int seat=1; seat <10; seat++){

            String student=students[seat-1];

            if(students == null || student.trim().isEmpty()){
             throw new RuntimeException(("Seat"+ seat + "Cannot be empty"));
            }
            if(!uniqStudent.add(student)){
                throw new RuntimeException("Duplicate " + "student found:"  +student);
            }

            seatingsMap.put(seat, student);
        }
        System.out.println("Seating Arrangment:");

        for(Map.Entry<Integer, String>entry:
                seatingsMap.entrySet()){
            System.out.println("seat" +entry.getKey() +"  "+entry.getValue());
        }
    }
}
