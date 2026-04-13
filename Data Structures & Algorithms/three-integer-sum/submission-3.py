class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # sort the array
        # using sliding window + 1 fixed traverse and find the threeSum

        sorted_nums = sorted(nums)
        res = []
        for i in range(0,len(sorted_nums)-2):
            if i > 0 and sorted_nums[i] == sorted_nums[i-1]:
                continue

            l, r = i+1, len(sorted_nums)-1
            while l < r and l < len(sorted_nums):
                three_sum = sorted_nums[i] + sorted_nums[l] + sorted_nums[r]

                if three_sum >0:
                    r -= 1
                elif three_sum <0:
                    l += 1
                else:
                    res.append([sorted_nums[i], sorted_nums[l], sorted_nums[r]])
                    l += 1
                    r -= 1
                    if sorted_nums[r] == sorted_nums[r+1]:
                        r -= 1
        
        return res