package programmers.level03;

import java.util.*;

public class Solution66 {

    public int[] solution(String[] keymap, String[] targets) {

        // 문자별 최소 입력 횟수 저장
        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {

            for (int i = 0; i < key.length(); i++) {

                char c = key.charAt(i);

                map.put(c,
                        Math.min(map.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }

        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {

            int sum = 0;
            boolean possible = true;

            for (char c : targets[i].toCharArray()) {

                if (!map.containsKey(c)) {
                    possible = false;
                    break;
                }

                sum += map.get(c);
            }

            answer[i] = possible ? sum : -1;
        }

        return answer;
    }

    public static void main(String[] args) {

        Solution66 sol = new Solution66();

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        int[] result = sol.solution(keymap, targets);

        System.out.println(Arrays.toString(result));
    }
}
