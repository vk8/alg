package ch1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

//        System.out.println(new Test().removeKdigits("1432219", 3));
//        System.out.println(new Test().removeKdigits("12312999", 3));
        System.out.println(new Test().removeKdigits("177799", 2));
//        System.out.println(new Test().removeKdigits("1432219", 3));
//        System.out.println(new Test().removeKdigits("10200", 1));
//        System.out.println(new Test().removeKdigits("", 1));
//        long time = System.currentTimeMillis();
//        try {
//            System.out.println(new Test().removeKdigits(Files.readString(Path.of("src/ch1/stringtoolong.txt")), 50000));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(System.currentTimeMillis() - time);
    }

    public String removeKdigits(String num, int k) {
        long time = System.currentTimeMillis();
        List<String> numList = new ArrayList<>(Arrays.asList(num.split("")));
        int lenOfResult = numList.size() - k;
        int lenOfChoise = k + 1;
        String result = "";
        int min = 0;
        PriorityQueue<Pair> queue = new PriorityQueue<>((p1, p2) -> p1.value.compareTo(p2.value) > 0 ? 1: -11);
        if (lenOfResult > 0) {
            for (int i = 0; i < lenOfChoise; i++) queue.add(new Pair(numList.get(i), i));
            for (int i = 0; i < lenOfResult; i++) {
                Pair minPair = queue.poll();
                while (minPair.index < min) {
                    minPair = queue.poll();
                }
                min = minPair.index;
                if (i < lenOfResult - 1) queue.add(new Pair(numList.get(lenOfChoise + i), lenOfChoise + i));
                result += minPair.value;
            }
        }
        System.out.println(System.currentTimeMillis() - time);
        return result.isEmpty() ? "0" : result.replaceFirst("^0+(?!$)", "");
    }

    public class Pair {
        String value;
        int index;

        public Pair(String value, int index) {
            this.value = value;
            this.index = index;
        }
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

