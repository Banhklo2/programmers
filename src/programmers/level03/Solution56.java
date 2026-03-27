package programmers.level03;

import java.util.Arrays;

public class Solution56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution56 sol = new Solution56();

        int[] score = {1, 2, 3, 1, 2, 3, 1};

        int result = sol.solution(3, 4, score);

        System.out.println(result);
    }
}
