import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Character> oneTimeChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                oneTimeChars.add(entry.getKey());
            }
        }

        Collections.sort(oneTimeChars);

        StringBuilder result = new StringBuilder();
        for (char c : oneTimeChars) {
            result.append(c);
        }

        return result.toString();
    }
}
