public class Solution {
    public String solution(String s) {
        // 방법 1
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        /*
        // 방법 2
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sortedString = new StringBuilder(new String(charArray)).reverse();
        return sortedString.toString();
        */
    }
}