import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int s : scoville) {
            minHeap.offer(s);
        }

        int mixCount = 0;

        while (minHeap.size() > 1 && minHeap.peek() < K) {
            int first = minHeap.poll(); 
            int second = minHeap.poll(); 
            
            int newScoville = first + (second * 2);
            minHeap.offer(newScoville); 
            mixCount++; 
        }

        if (minHeap.peek() < K) {
            return -1; 
        }

        return mixCount;
    }
}
