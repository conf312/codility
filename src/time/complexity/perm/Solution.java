package time.complexity.perm;

public class Solution {

    public int solution(int[] A) {
        if (A.length == 0) return 1;
        int result = 1;
        int[] tempArr = new int[A.length];

        for (int i=0; i < A.length; i++) {
            if (A[i] <= A.length) {
                tempArr[A[i]-1] = A[i];
            }
        }

        for (int a : tempArr) {
            if (a == 0) {
                return result;
            }
            result++;
        }

        return result;
    }
}
