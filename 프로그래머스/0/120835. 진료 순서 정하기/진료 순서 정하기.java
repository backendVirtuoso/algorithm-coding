class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1; 
            for (int j = 0; j < n; j++) {
                if (emergency[j] > emergency[i]) cnt++;
            }
            rank[i] = cnt;
        }
        return rank;
    }
}
