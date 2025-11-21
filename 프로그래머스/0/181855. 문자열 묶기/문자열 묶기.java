class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        int max = 0;

        for (String s : strArr) {
            int len = s.length();
            count[len]++;

            if (count[len] > max) {
                max = count[len];
            }
        }

        return max;
    }
}
