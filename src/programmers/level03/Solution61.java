package programmers.level03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution61 {

    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();

        for (int num : win_nums) {
            winSet.add(num);
        }

        int zeroCount = 0;
        int matchCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        int maxRank = getRank(matchCount + zeroCount);
        int minRank = getRank(matchCount);

        return new int[]{maxRank, minRank};
    }

    private int getRank(int matchCount) {
        if (matchCount == 6) return 1;
        if (matchCount == 5) return 2;
        if (matchCount == 4) return 3;
        if (matchCount == 3) return 4;
        if (matchCount == 2) return 5;
        return 6;
    }

    public static void main(String[] args) {
        Solution61 solution = new Solution61();

        int[] result1 = solution.solution(
                new int[]{44, 1, 0, 0, 31, 25},
                new int[]{31, 10, 45, 1, 6, 19}
        );
        System.out.println(Arrays.toString(result1));
    }
}
