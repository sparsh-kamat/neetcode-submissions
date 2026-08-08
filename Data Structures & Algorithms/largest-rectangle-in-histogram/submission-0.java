class Solution {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                rightmax[stack.pop()] = i;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            rightmax[stack.pop()] = n;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                leftmax[stack.pop()] = i;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            leftmax[stack.pop()] = -1;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, heights[i] * (rightmax[i] - 1 - leftmax[i]));
        }
        return ans;
    }
}