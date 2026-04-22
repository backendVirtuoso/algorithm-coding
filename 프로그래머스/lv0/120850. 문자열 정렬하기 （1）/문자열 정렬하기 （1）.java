import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch)); 
            }
        }
        Collections.sort(numbers);
        return numbers; 
    }
}
