package programmers.level03;

import java.util.Arrays;

public class Solution58 {
    public int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution58 sol = new Solution58();

        int[] answers = {1, 2, 3, 4};

        int result = sol.solution(answers);

        System.out.println(result);
    }
}
