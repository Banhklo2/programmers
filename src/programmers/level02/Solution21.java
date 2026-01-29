package programmers.level02;

// 하샤드 수
public class Solution21 {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution21 s = new Solution21();

        System.out.println(s.solution(18)); // 테스트
    }
}
