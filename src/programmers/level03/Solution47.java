package programmers.level03;

import java.util.Arrays;

public class Solution47 {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });

        return strings;
    }

    public static void main(String[] args) {
        Solution47 sol = new Solution47();

        String[] input = {"sun", "bed", "car"};
        int n = 1;

        String[] result = sol.solution(input, n);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
