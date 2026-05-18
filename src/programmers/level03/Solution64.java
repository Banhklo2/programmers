package programmers.level03;

public class Solution64 {

    public int solution(int n, int[] lost, int[] reserve) {

        int[] students = new int[n + 1];

        for (int i : lost) {
            students[i]--;
        }

        for (int i : reserve) {
            students[i]++;
        }

        for (int i = 1; i <= n; i++) {

            if (students[i] == -1) {

                if (i > 1 && students[i - 1] == 1) {
                    students[i]++;
                    students[i - 1]--;

                } else if (i < n && students[i + 1] == 1) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (students[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Solution64 solution = new Solution64();

        int result1 = solution.solution(
                5,
                new int[]{2, 4},
                new int[]{1, 3, 5}
        );

        int result2 = solution.solution(
                5,
                new int[]{2, 4},
                new int[]{3}
        );

        int result3 = solution.solution(
                3,
                new int[]{3},
                new int[]{1}
        );

        System.out.println("테스트1 결과 = " + result1); // 5
        System.out.println("테스트2 결과 = " + result2); // 4
        System.out.println("테스트3 결과 = " + result3); // 2
    }
}