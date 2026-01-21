package programmers.level01;

// 두 수의 나눗셈
public class Solution07 {
    int solution(int num1, int num2) {
        return (int)((double)num1/num2*1000);
    }

    public static void main(String[] args) {
        Solution07 s = new Solution07();
        System.out.println(s.solution(10, 3)); // 테스트
    }
}
