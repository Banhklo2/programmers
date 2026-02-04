package programmers.level02;

public class Solution27 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String answer = "";

        for (int i = 0; i < length - 4; i++) {
            answer += "*";
        }

        answer += phone_number.substring(length - 4);

        return answer;
    }

    public static void main(String[] args) {
        Solution27 s = new Solution27();

        System.out.println(s.solution("01033334444")); // 테스트
    }
}
