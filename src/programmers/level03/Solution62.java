package programmers.level03;

class Solution62 {

    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCount = 0;
        int matchCount = 0;

        for (int lotto : lottos) {

            if (lotto == 0) {
                zeroCount++;
                continue;
            }

            for (int win : win_nums) {

                if (lotto == win) {
                    matchCount++;
                    break;
                }
            }
        }

        int maxRank = getRank(matchCount + zeroCount);
        int minRank = getRank(matchCount);

        return new int[]{maxRank, minRank};
    }

    private int getRank(int count) {

        if (count < 2) {
            return 6;
        }

        return 7 - count;
    }

    public static void main(String[] args) {

        Solution62 solution = new Solution62();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] result = solution.solution(lottos, win_nums);

        System.out.println("최고 순위 : " + result[0]);
        System.out.println("최저 순위 : " + result[1]);
    }
}
