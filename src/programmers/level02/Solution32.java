package programmers.level02;

public class Solution32 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution32 s = new Solution32();

        System.out.println(s.solution(new int[]{1, 2}, new int[]{3, 4})); // 테스트
    }
}
