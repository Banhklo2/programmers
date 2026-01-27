package programmers.level02;

// 나머지가 1이 되는 수 찾기
public class Solution15 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();

        System.out.println(s.solution(2, 5)); // 테스트
    }
}
