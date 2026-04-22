import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> list = Arrays.asList(str_list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("l")) return list.subList(0, i);
            if (list.get(i).equals("r")) return list.subList(i + 1, list.size());
        }
        return List.of();
    }
}
