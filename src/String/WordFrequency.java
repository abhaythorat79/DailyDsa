package String;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        String s = "java is easy and java is powerful";
        s = s.toLowerCase();

        String[] words = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}