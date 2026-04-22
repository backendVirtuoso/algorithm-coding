import java.util.TreeMap;

public class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (String operation : operations) {
            String[] tokens = operation.split(" ");
            String command = tokens[0];
            int value = Integer.parseInt(tokens[1]);
            
            if ("I".equals(command)) {
                // 값이 삽입될 때마다 카운트를 관리
                map.put(value, map.getOrDefault(value, 0) + 1);
            } else if ("D".equals(command)) {
                if (value == 1) {
                    // 최대값 제거
                    if (!map.isEmpty()) {
                        int maxKey = map.lastKey();
                        if (map.put(maxKey, map.get(maxKey) - 1) == 1) {
                            map.remove(maxKey); // 카운트가 0이 되면 제거
                        }
                    }
                } else {
                    // 최소값 제거
                    if (!map.isEmpty()) {
                        int minKey = map.firstKey();
                        if (map.put(minKey, map.get(minKey) - 1) == 1) {
                            map.remove(minKey); // 카운트가 0이 되면 제거
                        }
                    }
                }
            }
        }
        
        if (map.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{map.lastKey(), map.firstKey()};
        }
    }
}
