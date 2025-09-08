import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> remain = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {  
                remain.add(todo_list[i]);
            }
        }
        
        return remain.toArray(new String[0]);
    }
}
