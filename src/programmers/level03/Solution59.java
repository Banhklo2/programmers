package programmers.level03;

public class Solution59 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;

        for (int s : section) {
            if (s > painted) {
                answer++;
                painted = s + m - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution59 sol = new Solution59();

        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        int result = sol.solution(n, m, section);

        System.out.println(result);
    }
}
