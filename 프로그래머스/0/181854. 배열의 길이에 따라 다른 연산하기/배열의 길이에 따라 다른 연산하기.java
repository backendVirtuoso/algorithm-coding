class Solution {
    public int[] solution(int[] arr, int n) {
        int[] result = new int[arr.length];
        boolean isOddLength = arr.length % 2 == 1;

        for (int i = 0; i < arr.length; i++) {
            if ((isOddLength && i % 2 == 0) || (!isOddLength && i % 2 == 1)) {
                result[i] = arr[i] + n;
            } else {
                result[i] = arr[i];
            }
        }

        return result;
    }
}
