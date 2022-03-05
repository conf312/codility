package iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Solution {

    public int solution(int N) {
        // write your code in Java SE 8

        String binary = convertBinary(N);
        String[] binaryArr = binary.split("");
        ArrayList<Integer> resultList = new ArrayList<>();

        int resultCnt = 0;
        boolean flagCnt = false;

        for (int i=0; i<binary.length(); i++) {
            if (flagCnt) {
                if (binaryArr[i].equals("1")) {
                    resultList.add(resultCnt);
                    flagCnt = false;
                    resultCnt = 0;
                } else {
                    resultCnt++;
                }
            }
            if (binaryArr[i].equals("1")) {
                flagCnt = true;
            }
        }
        return resultList.size() == 0 ? 0 : Collections.max(resultList);
    }

    public String convertBinary(int N) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        int mod = N;

        while (mod > 1) {
            if (mod % 2 == 0) {
                stack.push(0);
            } else {
                stack.push(1);
            }
            mod = mod / 2;
        }

        if (mod == 1) stack.push(1);

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

}
