class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String target = String.valueOf(k);
        
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            for (char c : numStr.toCharArray()) {
                if (String.valueOf(c).equals(target)) {
                    count++;
                }
            }
        }

        return count;
    }
}
