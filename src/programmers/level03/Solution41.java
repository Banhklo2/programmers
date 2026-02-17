package programmers.level03;

public class Solution41 {
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {

            if (c == ' ') {
                answer.append(c);
                index = 0;
            } else {
                answer.append(index % 2 == 0
                        ? Character.toUpperCase(c)
                        : Character.toLowerCase(c));
                index++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Solution41 sol = new Solution41();

        String result = sol.solution("try hello world");

        System.out.println(result);
    }
}
