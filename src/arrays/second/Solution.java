package arrays.second;

public class Solution {

    public int solution(int[] A) {
        int result = 0;
        for (int i : A) {
            result = result ^ i;
        }
        return result;
    }
}