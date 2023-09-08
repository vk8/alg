package ch1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new Test().dailyTemperatures(new int[]{73, 72, 71, 70, 69, 68, 69, 70, 71, 72, 73, 74, 75, 75, 75, 74, 73, 76})));
//        System.out.println(Arrays.toString(new Test().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
//        System.out.println(Arrays.toString(new Test().dailyTemperatures(new int[]{30, 40, 50, 60})));
//        System.out.println(Arrays.toString(new Test().dailyTemperatures(new int[]{30, 60, 90})));
//        System.out.println(new Test().removeKdigits("1432219", 3));
//        System.out.println(new Test().removeKdigits("12312999", 3));
//        System.out.println(new Test().removeKdigits("177799", 2));
//        System.out.println(new Test().removeKdigits("1432219", 3));
//        System.out.println(new Test().removeKdigits("10200", 1));
//        System.out.println(new Test().removeKdigits("", 1));
        long time = System.currentTimeMillis();
        try {
            System.out.println(new Test().removeKdigits(Files.readString(Path.of("src/ch1/stringtoolong.txt")), 50000));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - time);
    }

    public String removeKdigits(String num, int k) {
        long time = System.currentTimeMillis();
        List<String> numList = new ArrayList<>(Arrays.asList(num.split("")));
        int lenOfResult = numList.size() - k;
        int lenOfChoise = k + 1;
        String result = "";
        int min = 0;
        for (int i = 0; i < lenOfResult; i++) {
            String minStr = "z";
            for (int j = min; j < lenOfChoise + i; j++) {
                if (numList.get(j).compareTo(minStr) < 0) {
                    min = j;
                    minStr = numList.get(j);
                }
            }
            result += minStr;
            min++;
        }
        System.out.println(System.currentTimeMillis() - time);
        return result.isEmpty() ? "0" : result.replaceFirst("^0+(?!$)", "");
    }

    public int[] dailyTemperatures(int[] temperatures) {

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

