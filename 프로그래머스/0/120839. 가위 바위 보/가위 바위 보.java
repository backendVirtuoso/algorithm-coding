class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();

        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '2': 
                    result.append('0'); 
                    break;
                case '0': 
                    result.append('5');
                    break;
                case '5':
                    result.append('2');
                    break;
            }
        }

        return result.toString();
    }
}