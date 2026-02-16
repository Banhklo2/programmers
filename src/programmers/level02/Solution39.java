package programmers.level02;

public class Solution39 {

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int[] solution(int n, int m) {

        int gcdValue = gcd(n, m);
        int lcmValue = (n * m) / gcdValue;

        return new int[] {gcdValue, lcmValue};
    }

    public static void main(String[] args) {
        Solution39 s = new Solution39();

        int[] result = s.solution(3, 12);

        System.out.println(result[0]); // 최대공약수
        System.out.println(result[1]); // 최소공배수
    }
}
