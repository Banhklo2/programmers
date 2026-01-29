package programmers.level02;

// 정수 제곱근 판별
public class Solution19 {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);

        if (x * x == n) {
            return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution19 s = new Solution19();

        System.out.println(s.solution(121)); // 테스트
    }
}
