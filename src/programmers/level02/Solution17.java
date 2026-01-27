package programmers.level02;

import java.util.Arrays;

public class Solution17 {

    public int[] solution(long n) {
        // long → String
        String s = String.valueOf(n);

        // 결과 배열 생성
        int[] answer = new int[s.length()];

        // 뒤에서부터 하나씩 숫자로 변환
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(s.length() - 1 - i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution17 s = new Solution17();

        // 테스트
        System.out.println(Arrays.toString(s.solution(12345)));
    }
}
