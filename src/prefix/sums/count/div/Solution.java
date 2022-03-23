package prefix.sums.count.div;

public class Solution {
    public int solution(int A, int B, int K) {
        int limit = 2000000000;
        int result = 0;

        if (K > limit || (B - A) > limit)
            return result;
        if (K == 1)
            return (B - A) + K;
        if (A % K == 0) result++;

        result = (result + (B/K)) - (A/K);

        return result;
    }
}