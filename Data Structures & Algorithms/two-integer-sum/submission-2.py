class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        visitedNums = dict()

        for i, num in enumerate(nums):
            searching_num = target - num
            if searching_num in visitedNums:
                return [visitedNums.get(searching_num), i]
            else:
                visitedNums[num] = i