package programmers.level02;

// 자릿수 더하기
public class Solution13 {
    public int solution(int n) {
        int answer = 0;

        while (n >0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution13 s = new Solution13();

        System.out.println(s.solution(12)); // 테스트
    }
}
