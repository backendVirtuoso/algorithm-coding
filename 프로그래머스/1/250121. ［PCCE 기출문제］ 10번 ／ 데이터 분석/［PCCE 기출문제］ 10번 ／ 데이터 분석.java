import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 컬럼 인덱스 매핑
        Map<String, Integer> columns = new HashMap<>();
        columns.put("code", 0);
        columns.put("date", 1);
        columns.put("maximum", 2);
        columns.put("remain", 3);

        int extIndex = columns.get(ext);
        int sortByIndex = columns.get(sort_by);

        // 필터링 및 정렬
        List<int[]> filteredAndSortedData = Arrays.stream(data)
                .filter(row -> row[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(row -> row[sortByIndex]))
                .collect(Collectors.toList());

        // 결과를 int[][] 배열로 변환
        int[][] answer = new int[filteredAndSortedData.size()][];
        for (int i = 0; i < filteredAndSortedData.size(); i++) {
            answer[i] = filteredAndSortedData.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = sol.solution(data, ext, val_ext, sort_by);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
