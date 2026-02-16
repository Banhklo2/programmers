package programmers.level02;

public class Solution38 {

    // 별 찍기 기능을 메서드로 분리
    public void printRectangle(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Solution38 s = new Solution38();

        s.printRectangle(5, 3); // 여기서 값 직접 넣어서 테스트

    }
}