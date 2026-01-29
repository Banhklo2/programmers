package programmers.level02;

// x만큰 간격이 있는 n개의 숫자
import java.util.Arrays;

public class Solution16 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long step = x;

        for (int i = 0; i < n; i++) {
            answer[i] = step * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution16 s = new Solution16();

        System.out.println(Arrays.toString(s.solution(2, 5))); // 테스트
    }
}
