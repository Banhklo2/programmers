package programmers.level02;

public class Solution40 {

    public int solution(int n) {

        // 1. 10진수 → 3진수 문자열 변환
        String ternary = Integer.toString(n, 3);

        // 2. 문자열 뒤집기
        String reversed = new StringBuilder(ternary).reverse().toString();

        // 3. 뒤집은 3진수 → 10진수 변환
        int answer = Integer.parseInt(reversed, 3);

        return answer;
    }

    public static void main(String[] args) {

        Solution40 s = new Solution40();

        int result1 = s.solution(45);
        System.out.println(result1); // 예상: 7

        int result2 = s.solution(125);
        System.out.println(result2); // 예상: 229
    }
}
