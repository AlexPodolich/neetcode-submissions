class Solution {
    public boolean hasDuplicate(int[] nums) {
        // the first thing that comes to my mind is to use data strucutre as a Set where we have only unique elements

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if(seen.contains(num)) return true;

            seen.add(num);
        }

        return false;

        // second approach is to sort the array and compare nums[i] and nums[i+1]

        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length - 1; i++){
        //     if (nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }

        // return false;

        //third approach is to use brute force to check every possible pairs in the nums

        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i + 1; j < nums.length; j++){
        //         if (nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }

        // return false;
    }
}