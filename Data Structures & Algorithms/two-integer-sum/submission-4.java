class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force, lets try all pairs

        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i + 1; j < nums.length; j++){
        //         if ( nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};

        // solution using Map

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int searchedNum = target - nums[i];
            if(visited.containsKey(searchedNum)){
                return new int[]{visited.get(searchedNum), i};

            }
            visited.put(nums[i], i);
        }
        return new int[]{};
    }
}
