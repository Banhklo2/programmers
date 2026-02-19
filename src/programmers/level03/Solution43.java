package programmers.level03;

import programmers.level02.Solution38;

public class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;
        int lenP = p.length();
        long pNum = Long.parseLong(p);

        for (int i = 0; i <= t.length() - lenP; i++) {
            String sub = t.substring(i, i + lenP);
            long subNum = Long.parseLong(sub);

            if (subNum <= pNum) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution43 s = new Solution43();

        String t = "3141592";
        String p = "271";

        int result = s.solution(t, p);
        System.out.println(result);  // 2 출력
    }
}
