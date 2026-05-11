import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (String x : s.split(" ")) {
            if (x.equals("Z")) stack.pop();
            else stack.push(Integer.parseInt(x));
        }

        int sum = 0;

        for (int n : stack) sum += n;

        return sum;
    }
}