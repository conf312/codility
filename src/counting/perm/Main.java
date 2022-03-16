package counting.perm;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = new int[4];

        A[0] = 4;
        A[1] = 1;
        A[2] = 3;
        A[3] = 2;

        int result = solution.solution(A);

        System.out.println("==>  : " + result)
;    }
}
