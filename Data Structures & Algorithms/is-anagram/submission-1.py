class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        # s_char = [0] * 26
        # t_char = [0] * 26

        # for char in s:
        #     index = ord(char) - ord('a')
        #     s_char[index]+= 1
        
        # for char in t:
        #     index = ord(char) - ord('a')
        #     t_char[index] += 1

        # return tuple(s_char) == tuple(t_char)

        s_count = {}
        t_count = {}

        for char in s:
            s_count[char] = s_count.get(char, 0) + 1

        for char in t:
            t_count[char] = t_count.get(char, 0) + 1

        return s_count == t_count