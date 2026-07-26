class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        visitedNums = dict() #creating an empty dict for visited nums

        for i, num in enumerate(nums):
            searching_num = target - num #value that we need to find in the visited nums dict to get target
            if searching_num in visitedNums: #checking on existence in the dict
                return [visitedNums.get(searching_num), i] # returning value by key from dict(id of searching num) and id of current numbber in the list
            else:
                visitedNums[num] = i # add new visited num to the dictinary