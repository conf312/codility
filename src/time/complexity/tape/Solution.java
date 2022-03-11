package time.complexity.tape;

public class Solution {

    public int solution(int[] A) {
        int[] tmpArr = new int[A.length-1];
        int result = 0;
        int pVal = 0;
        int p2Val = 0;
        int arrindex=0;
        int sum_index = 1;

        while (true) {
            if (sum_index < A.length) {
                p2Val += A[sum_index];
                sum_index++;
            } else {
                pVal += A[arrindex];
                tmpArr[arrindex] = Math.abs(pVal - p2Val);
                arrindex++;
                sum_index = arrindex+1;
                p2Val = 0;
            }
            if (arrindex == (A.length-1)) break;
        }

        result = tmpArr[0];

        for (int i=0;  i<tmpArr.length; i++) {
            if (result > tmpArr[i]) {
                result = tmpArr[i];
            }
        }

        return result;
    }

}
