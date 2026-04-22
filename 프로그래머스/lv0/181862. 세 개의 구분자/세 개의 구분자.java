import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> res = new ArrayList<>();
        int s = -1;

        for (int i = 0, n = myStr.length(); i < n; i++) {
            char c = myStr.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                if (s != -1) { res.add(myStr.substring(s, i)); s = -1; }
            } else if (s == -1) s = i;
        }
        if (s != -1) res.add(myStr.substring(s));

        return res.isEmpty() ? new String[]{"EMPTY"} : res.toArray(new String[0]);
    }
}
