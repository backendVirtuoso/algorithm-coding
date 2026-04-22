class Solution {
    public int[] solution(String myString) {
        int parts = 1; 
        for (char c : myString.toCharArray()) if (c == 'x') parts++;

        int[] result = new int[parts];
        int idx = 0;
        for (char c : myString.toCharArray()) {
            if (c == 'x') idx++;
            else result[idx]++;
        }
        return result;
    }
}
