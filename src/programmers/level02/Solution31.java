package programmers.level02;

public class Solution31 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();

        System.out.println(s.solution(3)); // 테스트
    }
}
