public class Solution {
    boolean solution(String s) {
//         s = s.toLowerCase();
//         int ps = s.length() - s.replace("p", "").length();
//         int ys = s.length() - s.replace("y", "").length();
//         return ps == ys;
        
        // 효율 
        int ps = 0;
	    int ys = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'p', 'P' -> ps++;
                case 'y', 'Y' -> ys++;
            }
        }

        return ps == ys;
    }
}

/*
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
    
        // 다른 사람들의 방식을 참고 
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if ('p' == Character.toLowerCase(s.charAt(i))) {
                cnt++;
            } else if ('y' == Character.toLowerCase(s.charAt(i))) {
                cnt--;
            }
        }

        return cnt == 0;
    }
}
*/