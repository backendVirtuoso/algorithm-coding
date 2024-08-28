class Solution {
    public int solution(int order) {
        int clapCount = 0;

        String orderStr = Integer.toString(order);
        for (char digit : orderStr.toCharArray()) {
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++; 
            }
        }
        return clapCount;
    }
}