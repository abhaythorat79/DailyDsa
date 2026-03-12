package Stack;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {

        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int n = temp.length;

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {

                int index = stack.pop();
                result[index] = i - index;
            }

            stack.push(i);
        }

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
