package programmers.level03;

public class Solution55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;

        for (String word : goal) {
            if (i < cards1.length && cards1[i].equals(word)) {
                i++;
            } else if (j < cards2.length && cards2[j].equals(word)) {
                j++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Solution55 sol = new Solution55();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String result = sol.solution(cards1, cards2, goal);

        System.out.println(result);
    }
}
