class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0]; // 시작 인덱스
            int e = query[1]; // 종료 인덱스
            int k = query[2]; // 배수
            
            // s부터 e까지 반복
            for (int i = s; i <= e; i++) {
                // i가 k의 배수인지 확인
                if (k > 0 && i % k == 0) {
                    arr[i] += 1; // 배수일 경우 arr[i]에 1 추가
                }
            }
        }
        
        return arr; 
    }
}