package ch1;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures739 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 72, 71, 70, 69, 68, 69, 70, 71, 72, 73, 74, 75, 75, 75, 74, 73, 76})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 40, 50, 60})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 60, 90})));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.empty() && temperatures[i] >= temperatures[stack.peek()])
                stack.pop();

            if (!stack.empty())
                answer[i] = stack.peek() - i;

            stack.push(i);
        }
        return answer;
    }

    public int[] dailyTemperatures2(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int j = 0;
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                j = stack.pop();
                result[j] = i - j;
            }
            stack.push(i);
        }

        return result;
    }

}
