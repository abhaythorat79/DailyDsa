package Day2;

public class CountOccurrences {
    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 10, 40};
        int x = 10;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                count++;
            }
        }

        System.out.println("Occurrences of " + x + " = " + count);
    }
}
