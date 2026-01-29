package programmers.level02;

// 두 정수 사이의 합
public class Solution22 {
    public long solution(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();

        System.out.println(s.solution(3, 5)); // 테스트
    }
}
