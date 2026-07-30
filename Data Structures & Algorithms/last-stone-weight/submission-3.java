class Solution {
    public int lastStoneWeight(int[] stones) {
        // Brute Force

        // sort the array to easily get two largest stones
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int stone : stones){
            minHeap.add(-stone);
        }

        // loop through the array of stones while size > 1
        while (minHeap.size() > 1){
            int x = minHeap.poll();
            int y = minHeap.poll();

            if(y > x){
                minHeap.add(x - y);
            }
            System.out.println(minHeap);
        }

        

        minHeap.add(0);

        return Math.abs(minHeap.peek());
    }
}
