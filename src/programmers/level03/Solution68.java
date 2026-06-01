package programmers.level03;

import java.util.ArrayList;
import java.util.List;

public class Solution68 {

    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();

        for (int i : ingredient) {
            stack.add(i);

            if (stack.size() >= 4) {
                int size = stack.size();

                if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                    stack.remove(size - 1);
                    stack.remove(size - 2);
                    stack.remove(size - 3);
                    stack.remove(size - 4);

                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution68 sol = new Solution68();

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(sol.solution(ingredient)); // 2
    }
}
