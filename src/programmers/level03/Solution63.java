package programmers.level03;

public class Solution63 {

    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yCount[Y.charAt(i) - '0']++;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xCount[i], yCount[i]);

            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution63 sol = new Solution63();

        System.out.println(sol.solution("100", "2345"));      // -1
        System.out.println(sol.solution("100", "203045"));    // 0
        System.out.println(sol.solution("100", "123450"));    // 10
        System.out.println(sol.solution("12321", "42531"));   // 321
        System.out.println(sol.solution("5525", "1255"));     // 552
    }
}
