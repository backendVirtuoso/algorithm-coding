import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) return 1;
        if (arr1.length < arr2.length) return -1;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) return 1;
            if (arr1[i] < arr2[i]) return -1;
        }
        
        return 0;
    }
}
