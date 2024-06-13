class Solution {
    boolean solution(String s) {
/*      내가 직접 푼 방식         
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
*/        
        /* 다른 사람들의 방식을 참고 */
        boolean answer = true;
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if ('p' == Character.toLowerCase(s.charAt(i))) {
                cnt ++;
            } else if ('y' == Character.toLowerCase(s.charAt(i))) {
                cnt --;
            }
        }

        return cnt == 0;
    }
}