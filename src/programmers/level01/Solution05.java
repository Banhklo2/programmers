package programmers.level01;

// 숫자 비교하기
public class Solution05 {
    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution05 s = new Solution05();
        System.out.println(s.solution(3, 3)); // 테스트
    }
}
