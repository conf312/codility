package counting.missing;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int index = 1, beforeVal = 0;;
        boolean flag = false;

        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<>(A.length);

        for (int i : A) {
            if (i > 0) {
                if (i != beforeVal) list.add(i);
                beforeVal = i;
            }
        }

        for (int i : list) {
            if (index != i) {
                return index;
            } else {
                flag = true;
            }
            index++;
        }

        if (flag) return index;

        return 1;
    }
}
