package programmers.level03;

public class Solution44 {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int[] card : sizes) {
            int w = card[0];
            int h = card[1];

            int longSide = Math.max(w, h);
            int shortSide = Math.min(w, h);

            maxW = Math.max(maxW, longSide);
            maxH = Math.max(maxH, shortSide);
        }

        return maxW * maxH;
    }

    public static void main(String[] args) {
        Solution44 s = new Solution44();

        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        int result = s.solution(sizes);
        System.out.println(result);  // 4000 출력
    }
}
