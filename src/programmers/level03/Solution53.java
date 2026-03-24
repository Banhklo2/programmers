package programmers.level03;

import java.util.PriorityQueue;

public class Solution53 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hall = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hall.offer(score[i]);

            if (hall.size() > k) {
                hall.poll();
            }

            answer[i] = hall.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution53 sol = new Solution53();

        int[] result = sol.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
