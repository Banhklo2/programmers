package programmers.level01;

// 짝수의 합
public class Solution09 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution09 s = new Solution09();
        System.out.println(s.solution(10)); // 테스트
    }
}
