package programmers.level02;

// 짝수와 홀수
public class Solution01 {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        System.out.println(s.solution(2)); // 테스트
    }
}
