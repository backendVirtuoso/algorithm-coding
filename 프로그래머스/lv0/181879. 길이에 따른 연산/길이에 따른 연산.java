class Solution {
    public int solution(int[] num_list) {
        // 최적화
        int answer = (num_list.length >= 11) ? 0 : 1; 
        for (int num : num_list) {
            if (num_list.length >= 11) answer += num; 
            else answer *= num; 
        }
        return answer;
        
        // 직접 풀이
        // int answer = 1;
        // if (num_list.length >= 11) {
        //     for(int i = 0; i < num_list.length; i++) answer += num_list[i];
        //     answer -= 1;
        // } else {
        //     for(int i = 0; i < num_list.length; i++) answer *= num_list[i];
        // }
        // return answer;
    }
}