class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = []
        i = 0
        j=n
        while i < j and j<len(nums):
            res.append(nums[i])
            res.append(nums[j])
            i = i+1
            j = j+1
        return res
