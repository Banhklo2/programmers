package programmers.level02;

// 나머지가 1이 되는 수 찾기
public class Solution05 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution05 s = new Solution05();

        System.out.println(s.solution(2, 5)); // 테스트
    }
}
