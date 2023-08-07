package ch1;

import java.util.*;

public class DailyTemperatures739 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 72, 71, 70, 69, 68, 69, 70, 71, 72, 73, 74, 75, 75, 75, 74, 73, 76})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 40, 50, 60})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 60, 90})));
    }

    static final int MAX_TEMPERATURE = 100;

    static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        ArrayList<LinkedList<Integer>> listOfTemperaturesIndexes =
                new ArrayList<>(Collections.nCopies(MAX_TEMPERATURE + 1, null));

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemperature = temperatures[i];
            if (listOfTemperaturesIndexes.get(currentTemperature) == null)
                listOfTemperaturesIndexes.set(currentTemperature, new LinkedList<>(List.of(i)));
            else
                listOfTemperaturesIndexes.get(currentTemperature).add(i);
        }

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemperature = temperatures[i];
            int nextTemperature = MAX_TEMPERATURE + 1;
            int minIndexNextTemperature = temperatures.length;
            for (int j = currentTemperature + 1; j < listOfTemperaturesIndexes.size(); j++) {
                LinkedList<Integer> item = listOfTemperaturesIndexes.get(j);
                if (item != null && item.size() > 0)
                    if (item.getFirst() < minIndexNextTemperature) {
                        nextTemperature = j;
                        minIndexNextTemperature = item.getFirst();
                    }
            }

            if (minIndexNextTemperature < temperatures.length)
                answer[i] = minIndexNextTemperature - i;

            if (nextTemperature <= MAX_TEMPERATURE && i > minIndexNextTemperature)
                listOfTemperaturesIndexes.get(nextTemperature).remove();

            listOfTemperaturesIndexes.get(currentTemperature).remove();
        }

        return answer;
    }

}
