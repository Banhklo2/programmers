package programmers.level02;

public class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution26 s = new Solution26();

        int[] absolutes = {5, 9, 7, 10};
        boolean[] signs = {true, false, true, false}; // 테스트

        System.out.println(s.solution(absolutes, signs));
    }
}
