package time.complexity.frogjmp;

public class Solution {

    public int solution(int X, int Y, int D) {
        int s = Y-X;
        int d = s/D;
        return s % D == 0 ? d : d+1;
    }
}