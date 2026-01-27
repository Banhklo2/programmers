package programmers.level02;

// 짝수와 홀수
public class Solution11 {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.solution(2)); // 테스트
    }
}
