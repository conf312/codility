package counting.frog;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = new int[8];

        A[0] = 1;
        A[1] = 3;
        A[2] = 1;
        A[3] = 4;
        A[4] = 2;
        A[5] = 3;
        A[6] = 5;
        A[7] = 4;

        int result = solution.solution(5, A);

        System.out.println("==>  : " + result)
;    }
}
