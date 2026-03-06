package programmers.level03;

import java.util.Arrays;

public class Solution51 {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append(left);
        answer.append('0');
        answer.append(left.reverse());

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution51 sol = new Solution51();

        int[] food = {1, 3, 4, 6};
        String result = sol.solution(food);

        System.out.println(result);
    }
}
