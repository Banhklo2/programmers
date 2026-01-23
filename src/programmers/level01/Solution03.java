package programmers.level01;

// 몫 구하기
public class Solution03 {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Solution03 s = new Solution03();
        System.out.println(s.solution(10, 3)); // 테스트
    }
}
