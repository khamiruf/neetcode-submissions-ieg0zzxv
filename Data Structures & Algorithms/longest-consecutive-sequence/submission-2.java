class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n: nums) {
            numSet.add(n);
        }

        int longest = 0;
        for (int i: numSet) {
            if (!numSet.contains(i-1)) {
                int length = 1;
                while (numSet.contains(i+1)) {
                    length += 1;
                    i += 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
