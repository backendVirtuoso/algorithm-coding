import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, String> morseMap = new HashMap<>();
        String[] morseArr = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        for (int i = 0; i < morseArr.length; i++) {
            morseMap.put(morseArr[i], String.valueOf((char)('a' + i)));
        }

        String[] codes = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String code : codes) {
            sb.append(morseMap.get(code));
        }

        return sb.toString();
    }
}
