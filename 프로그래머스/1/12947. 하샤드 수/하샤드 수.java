class Solution {
    public boolean solution(int x) {
        int sumOfDigits = 0;
        int temp = x;

        while (temp > 0) {
            sumOfDigits += temp % 10; 
            temp /= 10; 
        }

        return x % sumOfDigits == 0;
    }
}