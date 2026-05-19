package programmers.level03;

public class Solution65 {

    public int solution(String s) {

        int answer = 0;
        int same = 0;
        int diff = 0;

        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {

            // 개수가 같아지면 새로운 문자열 시작
            if (same == diff) {
                answer++;
                x = s.charAt(i);
            }

            // 같은 문자 / 다른 문자 개수 세기
            if (s.charAt(i) == x) {
                same++;
            } else {
                diff++;
            }
        }

        return answer;
    }

    // 테스트용 main
    public static void main(String[] args) {

        Solution65 solution = new Solution65();

        System.out.println(solution.solution("banana")); // 3
        System.out.println(solution.solution("abracadabra")); // 6
        System.out.println(solution.solution("aaabbaccccabba")); // 3
    }
}
