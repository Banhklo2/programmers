package programmers.level02;

import java.util.Arrays;

public class Solution37 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int row = arr1.length;
        int col = arr1[0].length;

        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution37 s = new Solution37();

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int[][] result = s.solution(arr1, arr2);

        System.out.println(Arrays.deepToString(result));
    }
}
