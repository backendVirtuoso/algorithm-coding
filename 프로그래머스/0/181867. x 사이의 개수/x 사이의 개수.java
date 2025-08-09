import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> lengths = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'x') {
                lengths.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        lengths.add(count);

        int[] result = new int[lengths.size()];
        for (int i = 0; i < lengths.size(); i++) {
            result[i] = lengths.get(i);
        }
        return result;
    }
}
