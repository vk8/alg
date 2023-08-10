package ch1;

import java.util.*;

public class WiggleSortII324 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 16, 1, 7, 55, 27};
        new WiggleSortII324().wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 3, 2, 2, 3, 1};
        new WiggleSortII324().wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{4, 5, 5, 6};
        new WiggleSortII324().wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 4, 3, 4, 1, 2, 1, 3, 1, 3, 2, 3, 3};
        new WiggleSortII324().wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void wiggleSort(int[] nums) {
        int mid = nums.length / 2;
        dutchFlag(nums, findKthLargest(nums, mid + 1));
        int[] temp = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < mid; i++) {
            nums[i * 2 + 1] = temp[i];
            nums[i * 2] = temp[mid + i];
        }
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) pq.remove();
        }
        return pq.peek();
    }

    private static void dutchFlag(int[] nums, int mid) {
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

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
