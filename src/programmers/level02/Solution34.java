package programmers.level02;

import java.util.Arrays;

public class Solution34 {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] arr = s.toCharArray();

        // 문자 배열을 오름차순 정렬
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution34 s = new Solution34();

        System.out.println(s.solution("Zbcdefg")); // 테스트
    }
}
