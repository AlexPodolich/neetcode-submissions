class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int stone : stones){
            minHeap.offer(-stone);
        }

        while(minHeap.size() > 1){
            int x = minHeap.poll();
            int y = minHeap.poll();
            if (y > x){
                minHeap.add(x - y); 
            }
        }
        if(minHeap.size() < 1){
            return 0;
        }else{
            return Math.abs(minHeap.peek());
        }
    }
}
