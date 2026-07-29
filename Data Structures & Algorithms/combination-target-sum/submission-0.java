class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList();   
        recursion(nums, 0, cur, 0, target);
        return res;
    }

    public void recursion(int[] nums, int i, List<Integer> cur, int total, int target){
        if(total == target){
            res.add(new ArrayList(cur));
            return;
        }
        if(i >= nums.length || total > target){
            return;
        }

        cur.add(nums[i]);
        recursion(nums, i, cur, total + nums[i], target);
        cur.remove(Integer.valueOf(nums[i])); // or cur.remove(cur.size() - 1);
        recursion(nums, i + 1, cur, total, target);
    }
}
