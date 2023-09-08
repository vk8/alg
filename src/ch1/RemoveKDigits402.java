package ch1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveKDigits402 {

    public static void main(String[] args) {
        System.out.println(new RemoveKDigits402().removeKdigits("1432219", 3));
        System.out.println(new RemoveKDigits402().removeKdigits("12312999", 3));
        System.out.println(new RemoveKDigits402().removeKdigits("177799", 2));
        System.out.println(new RemoveKDigits402().removeKdigits("1432219", 3));
        System.out.println(new RemoveKDigits402().removeKdigits("10200", 1));
        System.out.println(new RemoveKDigits402().removeKdigits("", 1));
        System.out.println(new RemoveKDigits402().removeKdigits("1", 1));
        long time = System.currentTimeMillis();
        try {
            System.out.println(new RemoveKDigits402().removeKdigits1(Files.readString(Path.of("src/ch1/stringtoolong.txt")), 50000));
            System.out.println(new RemoveKDigits402().removeKdigits(Files.readString(Path.of("src/ch1/stringtoolong2.txt")), 8222));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Общее:" + (System.currentTimeMillis() - time));
    }

    public String removeKdigits3(String num, int k) {
        char[] arr = num.toCharArray();
        int n = arr.length, pos = -1, start = 0, len = n - k;
        if (n <= k)
            return "0";
        for (int i = 0; i < n; i++) {
            for (; pos >= 0 && k > 0 && arr[i] < arr[pos]; pos--, k--) ;
            arr[++pos] = arr[i];
        }
        while (start < len - 1 && arr[start] == '0')
            start++;
        return String.valueOf(arr, start, len - start);
    }

    public String removeKdigits(String num, int k) {
        if (num.length() <= k) return "0";
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && num.charAt(i) < stack.peek() && i - stack.size() < k)
                stack.pop();

            if (stack.size() < num.length() - k) stack.push(num.charAt(i));
        }
        return new StringBuilder(stack.stream().map(Object::toString).collect(Collectors.joining())).reverse().toString().replaceFirst("^0+(?!$)", "");
    }

    public String removeKdigits1(String num, int k) {
        List<Pair> list = new ArrayList<>();
        LinkedList<Pair> resultQueue = new LinkedList<>();

        for (int i = 0; i < k + 1 && i < num.length(); i++) list.add(new Pair(num.substring(i, i + 1), i));

        list.sort(Comparator.comparing(p -> p.value));
        if (!list.isEmpty()) resultQueue.add(list.remove(0));

        for (int i = k + 1; i < num.length(); i++) {
            list.add(new Pair(num.substring(i, i + 1), i));
            oneElementSort(list);

            int minInx = resultQueue.getLast().index;

            Iterator<Pair> each = list.iterator();
            while (each.hasNext())
                if (each.next().index < minInx) each.remove();
                else break;

            if (!list.isEmpty()) resultQueue.add(list.remove(0));
        }

        StringBuilder result = new StringBuilder();
        resultQueue.forEach(result::append);
        return result.isEmpty() || num.length() == k ? "0" : result.toString().replaceFirst("^0+(?!$)", "");
    }

    void oneElementSort(List<Pair> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).value.compareTo(list.get(i - 1).value) < 0) {
                Pair temp = list.get(i);
                list.set(i, list.get(i - 1));
                list.set(i - 1, temp);
            } else {
                break;
            }
        }
    }

    public class Pair {
        String value;
        int index;

        public Pair(String value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String removeKdigits2(String num, int k) {
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

        return result.isEmpty() ? "0" : result.replaceFirst("^0+(?!$)", "");
    }


}

