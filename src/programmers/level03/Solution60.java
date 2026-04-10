package programmers.level03;

public class Solution60 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = getDivisorCount(i);

            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }

        return answer;
    }

    private int getDivisorCount(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution60 sol = new Solution60();

        int number = 5;
        int limit = 3;
        int power = 2;

        int result = sol.solution(number, limit, power);

        System.out.println(result);
    }
}
