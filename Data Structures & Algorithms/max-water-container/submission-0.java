class Solution {
    public int maxArea(int[] heights) {
        int maxArea = -1;

        int i = 0;
        int j = heights.length - 1;

        while (i < j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(heights[i], heights[j]));
            if (heights[i] > heights[j])
                j--;
            else if (heights[i] < heights[j])
                i++;
            else {
                i++;
                j--;
            }
        }
        return maxArea;
    }
}
