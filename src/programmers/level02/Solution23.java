package programmers.level02;

// 콜라츠 추측
public class Solution23 {
    public int solution(int num) {
        long n = num;
        int count = 0;

        while (n != 1) {
            if (count == 500) {
                return -1;
            }

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution23 s = new Solution23();

        System.out.println(s.solution(6)); // 테스트
    }
}
