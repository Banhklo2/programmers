package programmers.level03;

import java.util.HashMap;
import java.util.Map;

public class Solution69 {

    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> score = new HashMap<>();

        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        for (char type : types) {
            score.put(type, 0);
        }

        for (int i = 0; i < survey.length; i++) {

            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);

            int choice = choices[i];

            if (choice < 4) {
                score.put(disagree, score.get(disagree) + (4 - choice));
            } else if (choice > 4) {
                score.put(agree, score.get(agree) + (choice - 4));
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(score.get('R') >= score.get('T') ? 'R' : 'T');
        answer.append(score.get('C') >= score.get('F') ? 'C' : 'F');
        answer.append(score.get('J') >= score.get('M') ? 'J' : 'M');
        answer.append(score.get('A') >= score.get('N') ? 'A' : 'N');

        return answer.toString();
    }

    public static void main(String[] args) {

        Solution69 solution = new Solution69();

        String[] survey1 = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices1 = {5, 3, 2, 7, 5};

        System.out.println(solution.solution(survey1, choices1));

        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 = {7, 1, 3};

        System.out.println(solution.solution(survey2, choices2));
    }
}
