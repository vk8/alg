package ch1;

public class KthLargestElement215 {
    public static void main(String[] args) {
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 1));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 2));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 3));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 4));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 5));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 6));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 7));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 8));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 9));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 10));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 11));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 12));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 13));
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{-10000, -9999, -9998, -10000, -9999, -9998, 0, 0, 9998, 9999, 10000, 9998, 9999, 10000}, 14));
    }

    public int findKthLargest(int[] nums, int k) {
        final int MAX_VALUE = 10000;
        final int MIN_VALUE = -10000;
        int[] tempArray = new int[MAX_VALUE - MIN_VALUE + 1];
        for (int num : nums) tempArray[MAX_VALUE + num]++;
        int i;
        for (i = tempArray.length - 1; i >= 0 && k > 0; i--) k -= tempArray[i];
        return i + 1 - MAX_VALUE;
    }
}

