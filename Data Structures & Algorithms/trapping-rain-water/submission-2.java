class Solution {
    public int trap(int[] height) {
        int trap = 0;

        for (int i = 1; i < height.length-1; i++) {
            int maxTrapforthisindex = 0;
            int l = 0;
            int r = height.length-1;
            for(int j =1;j<i;j++){
                if(height[j]>height[l])l=j;
            }
            for(int k =height.length-2;k>i;k--){
                if(height[k]>height[r])r=k;
            }
            maxTrapforthisindex = Math.max(0, Math.min(height[l], height[r]) - height[i]);
            trap += maxTrapforthisindex;
        }
        return trap;
    }
}
