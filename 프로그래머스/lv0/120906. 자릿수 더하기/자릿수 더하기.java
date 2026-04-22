class Solution {
    public int solution(int n) {
        int answer = 0;
        String numStr = Integer.toString(n);
        for (char digit : numStr.toCharArray()) {
            answer += Character.getNumericValue(digit);
        }
        return answer;
    }
}