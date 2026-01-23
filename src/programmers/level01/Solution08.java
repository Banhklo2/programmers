package programmers.level01;

// 각도기
public class Solution08 {
    public int solution(int angle) {
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Solution08 s = new Solution08();
        System.out.println(s.solution(120)); // 테스트
    }
}
