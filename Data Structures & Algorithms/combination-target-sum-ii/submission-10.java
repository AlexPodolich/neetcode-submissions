class Solution {

    Set<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new HashSet<>();
        Arrays.sort(candidates);
        List<Integer> cur = new ArrayList<>();
        recursion(candidates, 0, cur, 0, target);
        return new ArrayList<>(res);
    }

    public void recursion(int[] nums, int i, List<Integer> cur, int total, int target){
        if(total == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(i >= nums.length || total > target){
            return;
        }

        cur.add(nums[i]);
        recursion(nums, i + 1, cur, total + nums[i], target);
        cur.remove(cur.size() - 1);

        while(i + 1 < nums.length && nums[i] == nums[i + 1]){
            i++;
        }
        recursion(nums, i + 1, cur, total, target);
    }
}
