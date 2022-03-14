package time.complexity.tape;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[5];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 2;

        Solution solution = new Solution();

        int result = solution.solution(A);

        System.out.println("==> " + result);
    }
}
