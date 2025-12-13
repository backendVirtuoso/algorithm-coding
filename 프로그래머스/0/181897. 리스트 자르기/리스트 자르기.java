import java.util.*;

class Solution {
    public int[] solution(int n, int[] s, int[] arr) {
        int a = s[0], b = s[1], c = s[2];
        List<Integer> res = new ArrayList<>();

        switch (n) {
            case 1 -> { for (int i = 0; i <= b; i++) res.add(arr[i]); }
            case 2 -> { for (int i = a; i < arr.length; i++) res.add(arr[i]); }
            case 3 -> { for (int i = a; i <= b; i++) res.add(arr[i]); }
            case 4 -> { for (int i = a; i <= b; i += c) res.add(arr[i]); }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
