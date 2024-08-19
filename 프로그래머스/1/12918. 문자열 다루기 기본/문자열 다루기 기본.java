class Solution {
    public boolean solution(String s) {
        //return s.matches("[0-9]{4}|[0-9]{6}");
        
        // 라이브러리
        if (s.length() != 4 && s.length() != 6) return false;
        
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        
        return true;
    }
}