package programmers.level03;

public class Solution45 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == ' ') {
                answer.append(c);
            }
            else if (c >= 'a' && c <= 'z') {
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
            else if (c >= 'A' && c <= 'Z') {
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution45 solution = new Solution45();

        String s = "AB";
        int n = 1;

        String result = solution.solution(s, n);
        System.out.println(result);
    }
}
