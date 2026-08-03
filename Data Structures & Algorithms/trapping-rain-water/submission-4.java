class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int max = height[0];
        int rmax = height[n - 1];
        int trap = 0;
        prefix[0] = 0;
        suffix[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(height[i - 1], max);
            prefix[i] = max;
        }
        for (int j = n - 2; j >= 0; j--) {
            rmax = Math.max(height[j + 1], rmax);
            suffix[j] = rmax;
        }

        for (int i = 1; i < n - 1; i++) {
            trap += Math.max(0, Math.min(prefix[i], suffix[i]) - height[i]);
        }
        return trap;
    }
}
