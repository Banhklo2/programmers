package programmers.level01;

// 두 수의 차
public class Solution01 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        System.out.println(s.solution(10, 3)); // 테스트
    }
}
