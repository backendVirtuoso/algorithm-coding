import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indexedPriorities = new int[priorities.length];

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i); 
            indexedPriorities[i] = priorities[i]; 
        }

        int executedCount = 0; 
        while (!queue.isEmpty()) {
            int currentIndex = queue.poll(); 
            boolean hasHigherPriority = false;
            for (int i : queue) {
                if (indexedPriorities[currentIndex] < indexedPriorities[i]) {
                    hasHigherPriority = true; 
                    break;
                }
            }
            if (hasHigherPriority) {
                queue.offer(currentIndex);
            } else {
                executedCount++;
                if (currentIndex == location) {
                    return executedCount; 
                }
            }
        }
        return -1; 
    }
}
