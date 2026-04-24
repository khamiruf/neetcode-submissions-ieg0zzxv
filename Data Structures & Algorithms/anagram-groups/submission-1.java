class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // init an array of 26 every word
        // translate the words into a tuple of ascii
        // use it as a key of a hashmap, 
        // then if it already exists, append the word to it (value)
        // else, create a new entry
        // return it as a list of all the values
        Map<String, List<String>> res = new HashMap<>();

        for (String s: strs) {
            int[] count = new int[26];
            for (char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
