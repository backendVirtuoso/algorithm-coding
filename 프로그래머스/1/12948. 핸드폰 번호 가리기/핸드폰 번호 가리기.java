class Solution {
    public String solution(String phone_number) {
        String result = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            result += "*";
        }
        result += phone_number.substring(phone_number.length() - 4);
        return result;
    }
}