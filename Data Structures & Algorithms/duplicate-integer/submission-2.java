class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // Brute force

        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i+1; j < nums.length; j++){
        //         if (nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }

        // return false;

        // to use Set and comparet Size of init array and size of set

        // Set<Integer> set = new HashSet<>();

        // for (int num : nums){
        //     set.add(num);
        // }

        // return set.size() != nums.length;

        // 3rd solution using Set to check if num existed before in the array

        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}