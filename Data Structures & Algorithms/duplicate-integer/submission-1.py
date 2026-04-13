class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        unique_set = set()

        for n in nums:
            if n not in unique_set:
                unique_set.add(n)
            else:
                return True
        return False