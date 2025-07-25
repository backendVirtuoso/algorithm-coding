import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            boolean toDelete = false;
            for (int del : delete_list) {
                if (num == del) {
                    toDelete = true;
                    break;
                }
            }
            if (!toDelete) {
                result.add(num);
            }
        }

        // 리스트를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
