package counting.missing;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = new int[2];

        A[0] = -1;
        A[1] = -3;
//        A[2] = 3;
//        A[3] = 4;
//        A[4] = 1;
//        A[5] = 2;

        int result = solution.solution(A);

        System.out.print("==> : " + result);
    }
}
