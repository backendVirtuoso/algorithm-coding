class Solution {
    public int solution(String s) {
        int sum = 0, cur = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                cur = cur * 10 + (c - '0'); 
            } else {
                sum += cur;
                cur = 0;
            }
        }
        return sum + cur; 
    }
}
