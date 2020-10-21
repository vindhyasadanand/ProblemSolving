class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        #here they are indicating that return type must be a list which is of type int
        ans = []
        sum = 0
        for ele in nums:
            sum = sum + ele
            ans.append(sum)
        return ans