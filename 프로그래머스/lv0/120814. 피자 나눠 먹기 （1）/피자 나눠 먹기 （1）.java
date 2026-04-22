class Solution {
    public int solution(int n) {
        // return (n + 6) / 7;
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}