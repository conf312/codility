package prefix.sums.passing.cars;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] A = new int[5];

        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 1;

        int result = solution.solution(A);

        System.out.println("==> result : " + result);
    }
}
