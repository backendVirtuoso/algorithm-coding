import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothingCount = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothingCount.put(type, clothingCount.getOrDefault(type, 0) + 1);
        }

        int combinations = 1;
        for (int count : clothingCount.values()) {
            combinations *= (count + 1); 
        }

        return combinations - 1; 
    }
}
