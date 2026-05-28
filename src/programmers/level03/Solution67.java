package programmers.level03;

public class Solution67 {

    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            int count = 0;
            char current = c;

            while (count < index) {
                current++;

                // z를 넘으면 다시 a
                if (current > 'z') {
                    current = 'a';
                }

                // skip에 없는 문자만 count 증가
                if (!skip.contains(String.valueOf(current))) {
                    count++;
                }
            }

            answer.append(current);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution67 sol = new Solution67();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String result = sol.solution(s, skip, index);

        System.out.println("결과: " + result);
        System.out.println("기대값: happy");

        if ("happy".equals(result)) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
