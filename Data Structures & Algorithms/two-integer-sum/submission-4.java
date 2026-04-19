class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            // get compl of target and nums
            int compl = target - nums[i];
            if (complement.containsKey(compl)) {
                return new int[] { complement.get(compl), i };
            } else {
                // store num: index
                complement.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }
}
