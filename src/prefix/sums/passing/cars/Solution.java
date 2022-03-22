package prefix.sums.passing.cars;

public class Solution {

    public int solution(int[] A) {
        if (A[0] == 1) return 0;

        int result = 0;
        int addCnt = 0;

        for (int i : A) {
            if (i != 0) {
                result += addCnt;
            } else {
                addCnt++;
            }
            if (result > 1000000000) return -1;
        }

        return result;
    }
}