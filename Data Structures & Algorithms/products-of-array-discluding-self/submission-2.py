class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # 1 [1, 2, 4, 6]
        # x [1, 1, 2, 8], 48
        # x [48, 24, 6, 1]
        # x [48, 24, 12, 8]
        res = [1] * len(nums)

        pre = 1
        for x in range(len(nums)):
            res[x] = pre
            pre *= nums[x]
        
        post = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] *= post
            post *= nums[i]

        return res
