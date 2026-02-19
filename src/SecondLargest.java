public class SecondLargest {
    public static void main(String[] args) {

        int[] a = {10, 20, 92, 30};

        if (a.length < 2) {
            System.out.println("Not enough elements");
            return;
        }

        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}
