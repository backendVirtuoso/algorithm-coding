import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int N, int number) {
        Map<Integer, Integer> dp[] = new HashMap[9];
        for (int i = 1; i <= 8; i++) {
            dp[i] = new HashMap<>();
        }

        for (int i = 1; i <= 8; i++) {
            int num = Integer.parseInt(String.valueOf(N).repeat(i)); 
            dp[i].put(num, i); 
        }

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                for (int a : dp[j].keySet()) {
                    for (int b : dp[i - j].keySet()) {
                        dp[i].put(a + b, Math.min(dp[i].getOrDefault(a + b, Integer.MAX_VALUE), dp[j].get(a) + dp[i - j].get(b)));
                        dp[i].put(a - b, Math.min(dp[i].getOrDefault(a - b, Integer.MAX_VALUE), dp[j].get(a) + dp[i - j].get(b)));
                        dp[i].put(a * b, Math.min(dp[i].getOrDefault(a * b, Integer.MAX_VALUE), dp[j].get(a) + dp[i - j].get(b)));
                        if (b != 0) {
                            dp[i].put(a / b, Math.min(dp[i].getOrDefault(a / b, Integer.MAX_VALUE), dp[j].get(a) + dp[i - j].get(b)));
                        }
                    }
                }
            }
        }

        for (int i = 1; i <= 8; i++) {
            if (dp[i].containsKey(number)) {
                int result = dp[i].get(number);
                return result > 8 ? -1 : result;
            }
        }

        return -1; 
    }
}
