package programmers.level01;

// 나이 출력
public class Solution04 {
    public int solution(int age) {
        return 2022 - age + 1;
    }

    public static void main(String[] args) {
        Solution04 s = new Solution04();
        System.out.println(s.solution(35)); // 테스트
    }
}
