class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        char_counts = {}

        for s in strs:
            count = [0] * 26

            for c in s:
                count[ord(c) - ord('a')] += 1
            
            count_tuple = tuple(count)
            if count_tuple not in char_counts:
                char_counts[count_tuple] = []
            char_counts[count_tuple].append(s)

        return list(char_counts.values())

        
    # def isAnagram(s: str, t: str) -> Bool:
    #     if len(s) != len(t):
    #         return False
        
    #     unique_chars = [0]*26

    #     for c in s:
    #         unique_chars[ord(c) - ord('a')] += 1
    #     for c in t:
    #         unique_chars[ord(c) - ord('a')] -= 1

    #     for i in unique_chars:
    #         if i != 0:
    #             return False
    #     return True