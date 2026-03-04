package programmers.level03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution49 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = set.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        Solution49 sol = new Solution49();

        int[] array = {2, 1, 3, 4, 1};

        int[] result = sol.solution(array);

        System.out.println(Arrays.toString(result));
    }
}
