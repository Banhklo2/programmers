package programmers.level02;

// 약수의 합
public class Solution14 {
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
        Solution14 s = new Solution14();

        System.out.println(s.solution(12)); // 테스트
    }
}
