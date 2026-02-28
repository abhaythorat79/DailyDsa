package String;
public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";

        boolean[] seen = new boolean[256];
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!seen[ch]) {
                result += ch;
                seen[ch] = true;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}