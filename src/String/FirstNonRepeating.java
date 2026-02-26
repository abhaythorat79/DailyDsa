package String;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "aabbcde";

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find first non-repeating
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
