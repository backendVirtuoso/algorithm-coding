import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;

        int nextPowerOfTwo = Integer.highestOneBit(length);
        if (nextPowerOfTwo < length) nextPowerOfTwo <<= 1; 

        if (nextPowerOfTwo == length) return arr;

        return Arrays.copyOf(arr, nextPowerOfTwo);
    }
}