class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> tempStack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            while (!tempStack.isEmpty() && tempStack.peek()[0] < temp) {
                int[] popped = tempStack.pop();
                int prevIndex = popped[1];
                res[prevIndex] = (i-prevIndex);
            }
            tempStack.push(new int[] {temp, i});
        }
        return res;
    }
}
