package programmers.level03;

public class Solution54 {
    public String solution(int a, int b) {
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        int totalDays = 0;

        for (int i = 0; i < a - 1; i++) {
            totalDays += days[i];
        }

        totalDays += b;

        return week[(totalDays - 1) % 7];
    }

    public static void main(String[] args) {
        Solution54 sol = new Solution54();

        String result = sol.solution(5, 24);

        System.out.println(result);
    }
}
