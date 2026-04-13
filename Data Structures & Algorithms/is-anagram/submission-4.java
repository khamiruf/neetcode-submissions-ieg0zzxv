class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        int temp; 

        if (s.length() == 0 && t.length() == 0) {
            return true;
        }

        for (char c: s.toCharArray()) {
            if (charCounts.containsKey(c)) {
                temp = charCounts.get(c);
                temp += 1;
                charCounts.put(c, temp);
            } else {
                charCounts.put(c,1);
            }
        }

        for (char b: t.toCharArray()) {
            if (charCounts.containsKey(b)) {
                temp = charCounts.get(b);
                temp -= 1;
                charCounts.put(b, temp);
            } else {
                return false;
            }
        }

        for (Integer counts: charCounts.values()) {
            if (counts != 0) {
                return false;
            }
        }
        return true;
    }
}
