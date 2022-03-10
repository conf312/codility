package arrays;

public class Solution {

    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K == 0 || A.length == K) return A;
        if (K > A.length) K = K % A.length;
        int[] result = new int[A.length];
        int index = 0;
        for (int i=0; i<result.length; i++) {
            int index_k = i+K;
            if (index_k >= result.length) {
                result[index] = A[i];
                index++;
            } else {
                result[index_k] = A[i];
            }
        }
        return result;
    }
}