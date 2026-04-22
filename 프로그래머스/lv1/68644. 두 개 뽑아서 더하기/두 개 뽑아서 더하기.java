import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
        
        /* 내가 작성한 코드
        int[] temp = new int[numbers.length * (numbers.length - 1) / 2];
        int tempIndex = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[tempIndex++] = numbers[i] + numbers[j];
            }
        }
        
        Arrays.sort(temp);
        
        int[] result = new int[temp.length];
        int resultIndex = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == 0 || temp[i] != temp[i - 1]) {
                result[resultIndex++] = temp[i];
            }
        }
        
        return Arrays.copyOf(result, resultIndex);
        */
    }
    
}