class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        for (int x : arr) {
            int cnt = 0;
            while (true) {
                if (x >= 50 && x % 2 == 0) {
                    x /= 2;
                } else if (x < 50 && x % 2 == 1) {
                    x = x * 2 + 1;
                } else {
                    break;
                }
                cnt++;
            }
            answer = Math.max(answer, cnt); 
        }
        return answer;
    }
}
