class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for (String o : order) {
            sum += o.contains("latte") ? 5000 : 4500;
        }
        return sum;
    }
}
