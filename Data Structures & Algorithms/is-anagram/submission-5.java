class Solution {
    public boolean isAnagram(String s, String t) {
        // create an int array of 26 to store counts
        int[] charCounts = new int[26];

        for (int i=0; i<s.length(); i++) {
            charCounts[s.charAt(i) - 'a'] += 1;
        }
        for (int j=0; j<t.length(); j++) {
            charCounts[t.charAt(j) - 'a']  -= 1;
        }

        for (Integer count: charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
