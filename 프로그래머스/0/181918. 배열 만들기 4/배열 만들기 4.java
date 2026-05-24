import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();

        for (int num : arr) {
            while (!stk.isEmpty() && stk.peekLast() >= num) {
                stk.pollLast();
            }
            stk.addLast(num);
        }

        int[] answer = new int[stk.size()];
        int idx = 0;

        for (int num : stk) {
            answer[idx++] = num;
        }

        return answer;
    }
}