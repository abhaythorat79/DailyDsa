package String;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {

        String s = "programming";
        int k = 2;

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Convert to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Step 4: Print top k
        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}