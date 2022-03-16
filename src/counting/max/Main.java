package counting.max;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = new int[7];

        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;

        int[] result = solution.solution(5, A);

        for (int i : result) {
            System.out.print(i+",");
        }
;    }
}
