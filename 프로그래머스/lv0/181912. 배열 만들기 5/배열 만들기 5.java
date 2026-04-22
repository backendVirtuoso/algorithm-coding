import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for (String str : intStrs) {
            int val = Integer.parseInt(str.substring(s, s + l));
            
            if (val > k) result.add(val);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
