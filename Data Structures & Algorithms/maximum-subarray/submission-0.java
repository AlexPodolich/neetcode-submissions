class Solution {
    public int maxSubArray(int[] nums) {
        
        //Brute force 
        // int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }

        // return maxSum;

        //Kadane's algorithm
        int maxSub = nums[0], curSum = 0;

        for (int num : nums){
            if(curSum < 0){
                curSum = 0;
            }
            curSum += num;
            maxSub = Math.max(maxSub, curSum);
        }

        return maxSub;
    }
}
