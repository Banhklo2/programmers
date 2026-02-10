package programmers.level02;

public class Solution35 {
    public long solution(int price, int money, int count) {

        long total = 0;

        // 반복문을 이용한 합 계산
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }

        // 부족 금액 계산
        long 부족금액 = total - money;

        if (부족금액 > 0) {
            return 부족금액;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution35 s = new Solution35();

        System.out.println(s.solution(3, 20, 4)); // 테스트
    }
}
