import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> divisibleNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                divisibleNumbers.add(num);
            }
        } 
        if (divisibleNumbers.isEmpty()) return new int[]{-1};
        
        Collections.sort(divisibleNumbers);
        return divisibleNumbers.stream().mapToInt(i -> i).toArray();
    }
}
