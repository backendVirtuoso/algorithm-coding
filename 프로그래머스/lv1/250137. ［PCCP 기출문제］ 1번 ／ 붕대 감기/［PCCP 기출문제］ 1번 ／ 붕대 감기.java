class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cnt = bandage[0]; // 첫 번째 붕대 사용 횟수
        int now = health; // 현재 체력
        int std = 0; // 마지막 공격 시점

        int v1, v2; 
        for (int[] atk: attacks) {
            if (now <= 0) {
                return -1; // 체력이 0 이하이면 게임 오버
            }

            v1 = atk[0] - std - 1; // 현재 공격 시점과 마지막 공격 시점 사이의 시간
            v2 = v1 / cnt; // 붕대 사용 주기 동안 지난 시간

            std = atk[0]; // 현재 공격 시점을 마지막 공격 시점으로 업데이트
            now = Math.min(health, now + (v1 * bandage[1])); // 첫 번째 붕대에 의한 체력 회복
            now = Math.min(health, now + (v2 * bandage[2])); // 두 번째 붕대에 의한 체력 회복

            now -= atk[1]; // 공격에 의한 체력 감소
        }        

        return now <= 0 ? -1 : now; // 최종 체력이 0 이하이면 -1 반환, 그렇지 않으면 현재 체력 반환
    }
}