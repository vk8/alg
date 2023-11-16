package ch1;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] temp = new int[300000];
        int t = 100000000;
        for (int i = 0; i < temp.length; i++) temp[i] = ++t;
        long time = System.currentTimeMillis();
//        new TwoSum1().twoSum2(temp, 2);
//        new TwoSum1().twoSum(temp, 2);
//        System.out.println(System.currentTimeMillis() - time);

//        System.out.println(Arrays.toString(new TwoSum1().twoSum2(new int[]{3, 3}, 6)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum2(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum2(new int[]{3, 2, 4}, 6)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum2(new int[]{3, 2, 3}, 6)));
        System.out.println(Arrays.toString(new TwoSum1().twoSum2(new int[]{2, 5, 5, 11}, 10)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum(new int[]{3, 3}, 6)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum(new int[]{3, 2, 4}, 6)));
//        System.out.println(Arrays.toString(new TwoSum1().twoSum(new int[]{3, 2, 3}, 6)));
        System.out.println(Arrays.toString(new TwoSum1().twoSum(new int[]{2, 5, 5, 11}, 10)));
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if ((long) nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        int targetVal = 0, firstInx = -1, secondInx = -1;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) // O(n)
            temp[i] = target - nums[i]; // we want to solve this task through differences

        Arrays.sort(temp); // nlog(n) - we do want to do search using binarySearch because it's log(n)

        for (int i = 0; i < nums.length; i++) { // nlog(n)
            int searchResult = Arrays.binarySearch(temp, nums[i]); // 1) binarySearch does not search only the first equal, it may be the next too
            if (searchResult > -1) {
                targetVal = target - nums[i]; // 2) but if original array has the target/2 element it may be a problem
                if (targetVal == nums[i]) { // because of 1) and 2) we need to do such check
                    if (searchResult == temp.length - 1) {
                        if (temp[searchResult] != temp[searchResult - 1])
                            continue;
                    } else if (searchResult == 0) {
                        if (temp[searchResult] != temp[searchResult + 1])
                            continue;
                    } else {
                        if (temp[searchResult] != temp[searchResult - 1] && temp[searchResult] != temp[searchResult + 1])
                            continue;
                    }
                }
                firstInx = i;
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) // O(n)
            if (nums[i] == targetVal && i != firstInx) { // original array may have 2 equal numbers, and we have to exclude equal indexes
                secondInx = i;
                break;
            }

        return new int[]{firstInx, secondInx};
    }

}
