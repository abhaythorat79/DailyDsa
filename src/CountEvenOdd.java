public class CountEvenOdd {
    public static void main(String[] args) {

        int[] a = {10, 21, 32, 43, 54};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    }
}
