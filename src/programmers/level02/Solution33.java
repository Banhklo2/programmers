package programmers.level02;

public class Solution33 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);

            if (sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution33 s = new Solution33();

        System.out.println(s.solution(13, 17)); // 테스트
    }
}
