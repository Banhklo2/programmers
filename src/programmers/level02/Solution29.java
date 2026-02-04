package programmers.level02;

import java.util.Arrays;

public class Solution29 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;

        for (int num : arr) {
            if (num != min) {
                answer[idx++] = num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution29 s = new Solution29();

        int[] arr = {4, 3, 2, 1}; // 테스트
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}
