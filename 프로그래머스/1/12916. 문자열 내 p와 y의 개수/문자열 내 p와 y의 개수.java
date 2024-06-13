class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if ('p' == Character.toLowerCase(s.charAt(i))) {
                p_cnt ++;
            }
            if ('y' == Character.toLowerCase(s.charAt(i))) {
                y_cnt ++;
            }
        }
        if (p_cnt == y_cnt){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}