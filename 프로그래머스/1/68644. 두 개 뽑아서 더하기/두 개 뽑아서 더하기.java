import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
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
    }
}