class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // get the counts of each num and store in a hashmap
        // convert the counts hashmap into an array where the index reflects the count
        // iterate from the back and until res length == k, stop
        Map<Integer, Integer> numCounts = new HashMap<>();

        for (Integer n : nums) {
            numCounts.put(n, numCounts.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] countArr = new ArrayList[nums.length + 1];

        numCounts.forEach((n, c) -> {
            if (countArr[c] == null) {
                countArr[c] = new ArrayList<>();
                countArr[c].add(n);
            } else {
                countArr[c].add(n);
            }
        });

        int[] res = new int[k];
        int idx = 0;

        for (int i = countArr.length - 1; i >= 0; i--) {
            if (countArr[i] != null) {
                for (Integer elem : countArr[i]) {
                    if (idx < k) {
                        res[idx++] = (elem);
                    }
                }
            }
        }    
        return res;
    }
}
