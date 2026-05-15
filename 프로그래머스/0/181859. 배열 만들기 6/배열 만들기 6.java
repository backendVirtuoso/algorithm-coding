class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int idx = 0;

        for (int x : arr) {
            if (idx > 0 && stk[idx - 1] == x) {
                idx--;
            } else {
                stk[idx++] = x;
            }
        }

        if (idx == 0) return new int[]{-1};

        int[] answer = new int[idx];

        for (int i = 0; i < idx; i++) {
            answer[i] = stk[i];
        }

        return answer;
    }
}