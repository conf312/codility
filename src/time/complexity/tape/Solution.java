package time.complexity.tape;

public class Solution {
    public int solution(int[] A) {
        int result = 0, leftSum = 0, diff = 0;
        int rightSum = 0;
        for (int a : A) {
            rightSum += a;
        }
        for (int i=0; i<A.length-1; i++)  {
            leftSum = leftSum + A[i];
            diff = Math.abs(leftSum - (rightSum - leftSum));
            if (i == 0 || result > diff) {
                result = diff;
            }
        }
        return result;
    }
}
