import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        
        Arrays.sort(digits);
        
        StringBuilder sb = new StringBuilder(new String(digits));
        String sortedString = sb.reverse().toString();
        
        return Long.parseLong(sortedString);
    }
}