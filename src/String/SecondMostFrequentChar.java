package String;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentChar {
    public static void main(String[] args) {

        String s = "programming";
        s = s.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int firstMax = 0, secondMax = 0;
        char firstChar = ' ', secondChar = ' ';

        // find first and second max
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            char key = entry.getKey();

            if (value > firstMax) {
                secondMax = firstMax;
                secondChar = firstChar;

                firstMax = value;
                firstChar = key;
            } else if (value > secondMax && value != firstMax) {
                secondMax = value;
                secondChar = key;
            }
        }

        System.out.println("Second most frequent character: " + secondChar);
    }
}