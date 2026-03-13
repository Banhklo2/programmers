package programmers.level03;

public class Solution52 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int exchanged = (n / a) * b;
            answer += exchanged;
            n = (n % a) + exchanged;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution52 sol = new Solution52();

        int result = sol.solution(2, 1, 20);

        System.out.println(result);
    }
}
