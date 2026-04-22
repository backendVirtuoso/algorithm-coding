import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 컬럼 인덱스 매핑
        // 각 문자열 키를 해당되는 인덱스 값으로 매핑합니다.
        Map<String, Integer> columns = new HashMap<>();
        columns.put("code", 0);
        columns.put("date", 1);
        columns.put("maximum", 2);
        columns.put("remain", 3);

        // 필터링 조건의 컬럼 인덱스와 정렬 기준 컬럼 인덱스를 가져옵니다.
        int extIndex = columns.get(ext);
        int sortByIndex = columns.get(sort_by);

        // 주어진 데이터를 스트림으로 처리하여 필터링 및 정렬합니다.
        List<int[]> filteredAndSortedData = Arrays.stream(data)
                // 필터링: extIndex 위치의 값이 val_ext보다 작은 행만 남김
                .filter(row -> row[extIndex] < val_ext)
                // 정렬: sortByIndex 위치의 값을 기준으로 오름차순 정렬
                .sorted(Comparator.comparingInt(row -> row[sortByIndex]))
                // 결과를 리스트로 수집
                .collect(Collectors.toList());

        // 리스트를 다시 int[][] 배열로 변환합니다.
        int[][] answer = new int[filteredAndSortedData.size()][];
        for (int i = 0; i < filteredAndSortedData.size(); i++) {
            answer[i] = filteredAndSortedData.get(i);
        }

        // 결과 배열을 반환합니다.
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트 데이터를 정의합니다.
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };
        // 필터링할 컬럼명
        String ext = "date";
        // 필터링 기준 값
        int val_ext = 20300501;
        // 정렬할 기준 컬럼명
        String sort_by = "remain";

        // solution 메서드를 호출하여 결과를 얻습니다.
        int[][] result = sol.solution(data, ext, val_ext, sort_by);
        // 결과를 출력합니다.
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
