class Solution {
    public int solution(int n) {
        int i = 1, fact = 1;
        while (fact <= n) fact *= ++i;
        return i - 1;
    }
}
