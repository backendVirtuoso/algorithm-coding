class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        String strK = Integer.toString(k);
        int index = numStr.indexOf(strK);
        
        return index != -1 ? index + 1 : -1;
    }
}