class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        
        for (int i = n; i < length; i++) {
            answer[i - n] = num_list[i];
        }
        
        for (int i = 0; i < n; i++) {
            answer[length - n + i] = num_list[i];
        }
        
        return answer;
    }
}
