class Solution {
    public int solution(int n) {
        int compositeCount = 0;
        for (int i = 1; i <= n; i++) {
            int divisorCount = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) divisorCount++;
            }
            if (divisorCount >= 3) compositeCount++;
        }
        return compositeCount;
    }
}
