package ch1;

public class test {
    public static void main(String[] args) {
//        Integer.toBinaryString(N)
        int N = 7; // 5=101 6=110 7=111 8=1000
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(f(N,""));
    }

    static String f(int a, String result) {
        int remainder = a % 2;
        int quotient = a / 2;
        if (quotient > 1) return f(quotient, remainder + result);
        else return quotient + "" + remainder + result;
    }

}
