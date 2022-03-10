package arrays;

public class Main {
    public static void main(String[] args) {
        Solution arraysSolution = new Solution();
        int[] A = {1, 1, 2, 3, 5};
        int K = 42;
        int[] result = arraysSolution.solution(A,K);
        for (int val : result) {
            System.out.print(val + ",");
        }
    }
}
