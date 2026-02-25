package programmers.level03;

public class Solution46 {
    public int solution(String s) {
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution46 sol = new Solution46();

        System.out.println(sol.solution("one4seveneight")); // 1478
        System.out.println(sol.solution("23four5six7"));    // 234567
        System.out.println(sol.solution("2three45sixseven")); // 234567
        System.out.println(sol.solution("123")); // 123
    }
}
