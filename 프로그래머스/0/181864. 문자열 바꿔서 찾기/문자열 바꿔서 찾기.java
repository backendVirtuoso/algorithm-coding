public class Solution {
    public int solution(String myString, String pat) {
        StringBuilder swapped = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'A') {
                swapped.append('B');
            } else {
                swapped.append('A');
            }
        }

        if (swapped.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
