package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WiggleSortII324 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 16, 1, 7, 55, 27};
        new WiggleSortII324().wiggleSort(arr, 7);
        System.out.println(Arrays.toString(arr));
//        arr = new int[]{1, 3, 2, 2, 3, 1};
//        new WiggleSortII324().wiggleSort(arr, 3);
//        System.out.println(Arrays.toString(arr));
//        arr = new int[]{4, 5, 5, 6};
//        new WiggleSortII324().wiggleSort(arr, 5);
//        System.out.println(Arrays.toString(arr));
//        arr = new int[]{1, 4, 3, 4, 1, 2, 1, 3, 1, 3, 2, 3, 3};
//        new WiggleSortII324().wiggleSort(arr, 3);
//        System.out.println(Arrays.toString(arr));
    }

    public void wiggleSort(int[] nums, int mid) {
        //dutchFlag(nums, mid);
        //quickSelect(new int[]{12, 5, 16, 1, 7, 55, 27}, 4);
    }

    public void dutchFlag(int[] nums, int mid) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (j <= k) {
            if (nums[j] > mid) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] < mid) {
                swap(nums, j, k);
                k--;
            } else
                j++;
        }

    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public int quickSelect(List<Integer> nums, int k) {
        int pivotIndex = new Random().nextInt(nums.size());
        int pivot = nums.get(pivotIndex);

        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int num: nums) {
            if (num > pivot) {
                left.add(num);
            } else if (num < pivot) {
                right.add(num);
            } else {
                mid.add(num);
            }
        }

        if (k <= left.size()) {
            return quickSelect(left, k);
        }

        if (left.size() + mid.size() < k) {
            return quickSelect(right, k - left.size() - mid.size());
        }

        return pivot;
    }
}
