package programmers.level02;

public class Solution36 {
    public boolean solution(String s) {
        int len = s.length();
        if (len != 4 && len != 6) return false;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution36 s = new Solution36();

        System.out.println(s.solution("a234")); // 테스트
    }
}
