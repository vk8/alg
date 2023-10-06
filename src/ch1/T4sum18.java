package ch1;

import java.util.*;

public class T4sum18 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] arr2 = new int[]{
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr1 = new int[]{
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200};

//        System.out.println(new Test().fourSum(new int[]{2, 2, 2, 2, 2}, 8));
//        System.out.println(new Test().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
//        System.out.println(new Test().fourSum(new int[]{-5, 5, 4, -3, 0, 0, 4, -2}, 4));
//        System.out.println(new Test().fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
//        System.out.println(new Test().fourSum(arr2, 0));
        System.out.println(new T4sum18().fourSum(arr1, 8));
//        System.out.println(new Test().fourSum(arr, 216));
        System.out.println(System.currentTimeMillis() - time);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] resultArr = new int[100000][4];
        int counter = 0;
        for (int i = 0; i < nums.length - 3; i++)
            for (int j = i + 1; j < nums.length - 2; j++)
                for (int k = j + 1; k < nums.length - 1; k++)
                    for (int l = k + 1; l < nums.length; l++)
                        if ((long) nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            int[] sorted = sort(new int[]{nums[i], nums[j], nums[k], nums[l]});
                            if (!contains(resultArr, counter, sorted))
                                resultArr[counter++] = sorted;
                        }
        for (int i = 0; i < counter; i++)
            result.add(Arrays.asList(resultArr[i][0], resultArr[i][1], resultArr[i][2], resultArr[i][3]));

        return result;
    }

    int[] sort(int[] sorted) {
        int temp;
        for (int i = 0; i < 3; i++)
            for (int j = 1; j < 4 - i; j++)
                if (sorted[j] < sorted[j - 1]) {
                    temp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = temp;
                }
        return sorted;
    }

    boolean contains(int[][] src, int len, int[] arr) {
        for (int i = 0; i < len; i++)
            if (src[i][0] == arr[0] && src[i][1] == arr[1] && src[i][2] == arr[2] && src[i][3] == arr[3])
                return true;
        return false;
    }

}
