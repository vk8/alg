package ch1;

import java.util.Arrays;

public class WiggleSortII324 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 1, 1, 6, 4};
        new WiggleSortII324().wiggleSort(arr, 4);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 3, 2, 2, 3, 1};
        new WiggleSortII324().wiggleSort(arr, 3);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{4, 5, 5, 6};
        new WiggleSortII324().wiggleSort(arr, 5);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 4, 3, 4, 1, 2, 1, 3, 1, 3, 2, 3, 3};
        new WiggleSortII324().wiggleSort(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public void wiggleSort(int[] nums, int mid) {
        dutchFlag(nums, mid);
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
}
