package programmers.level02;

public class Solution30 {
    public String solution(String s) {
        int len = s.length();
        int mid = len / 2;

        if (len % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        } else {
            return s.substring(mid, mid + 1);
        }
    }

    public static void main(String[] args) {
        Solution30 s = new Solution30();

        System.out.println(s.solution("abcde"));
        System.out.println(s.solution("qwer"));  // 테스트
    }
}
