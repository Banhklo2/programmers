package programmers.level02;

public class Solution20 {
    public long solution(long n) {
        int[] count = new int[10];

        while (n > 0) {
            count[(int)(n % 10)]++;
            n /= 10;
        }

        long answer = 0;
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                answer = answer * 10 + i;
                count[i]--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution20 s = new Solution20();

        System.out.println(s.solution(118372)); // 테스트
    }
}
