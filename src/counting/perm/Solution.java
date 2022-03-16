package counting.perm;

import java.util.HashMap;

public class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<A.length; i++) {
            if (A[i] <= A.length) {
                hashMap.put(A[i], A[i]);
            }
        }
        return hashMap.size() == A.length ? 1 : 0;
    }
}
