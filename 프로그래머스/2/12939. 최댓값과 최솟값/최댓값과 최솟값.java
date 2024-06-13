import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        
        int[] arr = new int[answer.length];
        for(int i = 0; i < answer.length; i++) {
            arr[i] = Integer.parseInt(answer[i]);
        }
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[arr.length - 1];
        
        return min + " " + max;
    }
}