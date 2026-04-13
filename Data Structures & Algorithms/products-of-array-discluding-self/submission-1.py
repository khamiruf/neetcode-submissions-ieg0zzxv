class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # initialize res array 
        res = [1] * len(nums)

        pre = 1
        for i in range(len(nums)):
            res[i] *= pre
            pre *= nums[i]

        post = 1
        for x in range(len(nums)-1, -1, -1):
            res[x] *= post
            post *= nums[x]

        print(res)

        return res