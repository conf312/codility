package time.complexity.perm;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[4];
        A[0] = 2;
        A[1] = 3;
        A[2] = 1;
        A[3] = 5;

        Solution solution = new Solution();

        int result = solution.solution(A);

        System.out.println("==> " + result);
    }
}
