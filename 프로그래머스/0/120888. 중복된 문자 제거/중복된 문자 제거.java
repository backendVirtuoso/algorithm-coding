import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> used = new HashSet<>();

        StringBuilder builder = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (used.contains(c)) continue;
            used.add(c);
            builder.append(c);
        }

        return builder.toString();
        /*
        String result = "";
		
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) 
				result += my_string.charAt(i);
		}
		return result;
        */
    }
}