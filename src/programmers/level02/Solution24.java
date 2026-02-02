package programmers.level02;

public class Solution24 {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Solution24 s = new Solution24();

        System.out.println(s.solution(new String[]{"Jane", "Kim"})); // 테스트
    }
}
