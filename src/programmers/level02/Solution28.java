package programmers.level02;

public class Solution28 {
    public int solution(int[] numbers) {
        int total = 45;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        Solution28 s = new Solution28();

        System.out.println(s.solution(new int[]{1, 2})); // 테스트
    }
}
