class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty())
                stack.push(i);

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            ans[stack.peek()] = 0;
            stack.pop();
        }

        return ans;
    }
}
