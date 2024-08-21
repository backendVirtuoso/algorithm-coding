class Solution {
    public String solution(String[] seoul) {
        String str = "Kim";
        int ans = 0;
        for(int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(str) == true) {
                ans = i;
            }
        }
        String answer = "김서방은 " + ans + "에 있다";
        return answer;
    }
}