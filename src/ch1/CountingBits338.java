package ch1;

import java.util.Arrays;

public class CountingBits338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountingBits338().countBits(0)));
        System.out.println(Arrays.toString(new CountingBits338().countBits(1)));
        System.out.println(Arrays.toString(new CountingBits338().countBits(2)));
        System.out.println(Arrays.toString(new CountingBits338().countBits(5)));
    }


    public int[] countBits(int n) {
        if (n == 0) return new int[]{0};
        long pow = ((Double) Math.ceil(Math.log(n + 1) / Math.log(2))).intValue();
        int max = ((Double) Math.pow(2, pow)).intValue();
        int[] tempArr = new int[max];
        tempArr[1]++;
        for (int i = 2; i < max; i *= 2) {
            System.arraycopy(tempArr, 0, tempArr, i, i);
            for (int j = i; j < i * 2; j++) tempArr[j] = ++tempArr[j];
        }
        return Arrays.copyOf(tempArr, n + 1);
    }

    public int[] countBits2(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }
}
