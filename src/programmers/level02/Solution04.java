package programmers.level02;

// 약수의 합
public class Solution04 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution04 s = new Solution04();

        System.out.println(s.solution(12)); // 테스트
    }
}
