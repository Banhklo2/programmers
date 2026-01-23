package programmers.level02;

// 평균 구하기
public class Solution02 {
    public double solution(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int[] arr = {1, 2, 3, 4};
        System.out.println(s.solution(arr)); // 테스트
    }
}
