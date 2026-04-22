class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
/*        
        if (x >= 0 && y >= 0) return 1;
        else if (x <= 0 && y >= 0) return 2;
        else if (x <= 0 && y <= 0) return 3;
        else return 4;
*/
        // 다른 방법
        // 사분면 판별
        if (x > 0) return (y > 0) ? 1 : 4; // 제1사분면 또는 제4사분면
        else return (y > 0) ? 2 : 3; // 제2사분면 또는 제3사분면
    }
}