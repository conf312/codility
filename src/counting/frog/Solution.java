package counting.frog;

import java.util.HashMap;

public class Solution {
    public int solution(int X, int[] A) {
        int result = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<A.length; i++) {
            hashMap.put(A[i],A[i]);
            if (X == hashMap.size()) {
                return i;
            }
        }
        return result;
    }
}
