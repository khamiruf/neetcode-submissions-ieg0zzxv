class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count_bucket = [[] for x in range(len(nums) + 1)]
        print(count_bucket)

        # do the count for each nums and store into a hash map
        count_n = {}
        for n in nums:
            if n not in count_n:
                count_n[n] = 1
            else:
                count_n[n] += 1

        for n, c in count_n.items():
            # use c -- count as the index in count_bucket
            # store the value -- n
            print(c)
            count_bucket[c].append(n)

        # iterate from the back and return the nums up to k
        res = []
        for i in range(len(count_bucket)-1, 0, -1):
            for n in count_bucket[i]:
                res.append(n)
                if len(res) == k:
                    return res
