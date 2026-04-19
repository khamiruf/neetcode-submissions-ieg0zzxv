class Solution {
    public boolean isAnagram(String s, String t) {
        // use a char array of len 26
        // add the counts in the indexed array
        int[] char_counts = new int[26];

        for (char c_s: s.toCharArray()) {

            int index = c_s - 'a';
            char_counts[index] += 1;
        }

        for (char c_t: t.toCharArray()) {
            int t_index = c_t - 'a';
            char_counts[t_index] -= 1;
        }

        for (int count: char_counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
