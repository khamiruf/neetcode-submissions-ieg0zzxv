class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_char = [0] * 26
        t_char = [0] * 26

        for char in s:
            index = ord(char) - ord('a')
            s_char[index]+= 1
        
        for char in t:
            index = ord(char) - ord('a')
            t_char[index] += 1

        return tuple(s_char) == tuple(t_char)