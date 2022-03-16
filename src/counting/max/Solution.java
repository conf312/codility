package counting.max;

public class Solution {
    public int[] solution(int N, int[] A) {
        int[] counterArr = new int[N];
        int max = 0, lastMax = 0;

        for (int i=0; i<N; i++) {
            counterArr[i] = 0;
        }

        for (int k=0; k<A.length; k++) {
            if (A[k] > N) {
                lastMax = max;
            } else {
                int curMax = Math.max(lastMax, counterArr[A[k] - 1]);
                counterArr[A[k] - 1]  = curMax + 1;
                max = Math.max(counterArr[A[k] - 1], max);
            }
        }

        for (int j=0; j<N; j++) {
            System.out.println("counterArr["+j+"] : " + counterArr[j]);
            counterArr[j] = Math.max(counterArr[j], lastMax);
        }

        return counterArr;
    }
}
