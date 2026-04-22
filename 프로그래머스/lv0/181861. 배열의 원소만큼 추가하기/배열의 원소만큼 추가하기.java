class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for (int n : arr) size += n;

        int[] result = new int[size];

        int idx = 0;
        for (int n : arr) {
            for (int i = 0; i < n; i++) {
                result[idx++] = n;
            }
        }

        return result;
    }
}
