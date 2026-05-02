class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parentMap = new HashMap<>();
        parentMap.put('}', '{');
        parentMap.put(')', '(');
        parentMap.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c: s.toCharArray()) {
            if (parentMap.containsKey(c)) {
                // the c is now in the closed bracket
                if (stack.isEmpty()) {
                    return false;
                } else if (!stack.peek().equals(parentMap.get(c))) {
                    return false;
                }
                stack.pop();
            } else {
                // in the open bracket
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
