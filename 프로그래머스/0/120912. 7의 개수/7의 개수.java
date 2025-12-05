class Solution {
    public int solution(int[] array) {
        int count = 0;
        for (int n : array) {
            while (n > 0) {
                if (n % 10 == 7) count++;
                n /= 10;
            }
        }
        return count;
    }
}
