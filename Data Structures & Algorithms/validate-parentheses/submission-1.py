class Solution:
    def isValid(self, s: str) -> bool:
        closed_bracket = {
            '}': '{',
            ']': '[',
            ')': '('
        }

        stack = []
        for b in s:
            if b in closed_bracket:
                if not stack or closed_bracket[b] != stack[-1]:
                    return False
                else:
                    stack.pop()
            else:
                stack.append(b)
        return len(stack) == 0