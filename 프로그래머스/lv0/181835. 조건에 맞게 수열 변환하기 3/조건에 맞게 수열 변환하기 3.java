class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = (k % 2 == 1) ? arr[i] * k : arr[i] + k;
        }
        
        return result;
    }
}
