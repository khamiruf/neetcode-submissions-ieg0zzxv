class Solution {
    public int[] twoSum(int[] nums, int target) {
        // store key: index
        HashMap<Integer, Integer> complement = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int compl = target - nums[i];
            if (complement.containsKey(compl)) {
                int indexOfCompl = complement.get(compl);
                return new int[]{indexOfCompl, i};
            } else {
                complement.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
