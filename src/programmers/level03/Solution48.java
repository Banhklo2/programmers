package programmers.level03;

import java.util.Arrays;

public class Solution48 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            int[] sliced = Arrays.copyOfRange(array, i - 1, j); // end는 exclusive라서 j 그대로
            Arrays.sort(sliced);
            answer[idx] = sliced[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution48 sol = new Solution48();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        int[] result = sol.solution(array, commands);

        System.out.println(Arrays.toString(result));
    }
}
