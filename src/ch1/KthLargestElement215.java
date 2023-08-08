package ch1;

public class KthLargestElement215 {
    public static void main(String[] args) {
        System.out.println(new KthLargestElement215().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        int[] transitional = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            if (nums[i] < 0) {
                //index =
            }
        }
        return 1;
    }
}
