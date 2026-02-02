package programmers.level02;

import java.util.*;

public class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[] { -1 };
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution25 s = new Solution25();

        System.out.println(Arrays.toString(s.solution(new int[]{5, 9, 7, 10}, 5))); // 테스트
    }
}
