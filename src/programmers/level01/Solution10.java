package programmers.level01;

// 배열의 평균값
public class Solution10 {
    double solution(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); // 테스트
    }
}
