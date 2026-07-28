class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Brute force approach

        // for (int i = 0; i < nums.length; i++){
        //     for (int j = 0; j < nums.length; j++){
        //         if (nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }

        // return new int[]{};

        // Optimal solution with Map

        Map<Integer, Integer> checkedNums = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            int searchedNum = target - nums[i];
            if(checkedNums.containsKey(searchedNum)){
                return new int[]{checkedNums.get(searchedNum), i};
            }
            checkedNums.put(nums[i], i);
        }

        return new int[]{};
    }
}
