class Solution {
    public int[] solution(int n, int[] s, int[] arr) {
        int a = s[0], b = s[1], c = s[2];
        int len, idx = 0;

        switch (n) {
            case 1: len = b + 1; break;
            case 2: len = arr.length - a; break;
            case 3: len = b - a + 1; break;
            default: len = (b - a) / c + 1;
        }

        int[] res = new int[len];

        switch (n) {
            case 1:
                for (int i = 0; i <= b; i++) res[idx++] = arr[i];
                break;
            case 2:
                for (int i = a; i < arr.length; i++) res[idx++] = arr[i];
                break;
            case 3:
                for (int i = a; i <= b; i++) res[idx++] = arr[i];
                break;
            case 4:
                for (int i = a; i <= b; i += c) res[idx++] = arr[i];
        }
        return res;
    }
}
