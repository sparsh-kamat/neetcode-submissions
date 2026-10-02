class Solution {
    public int findMin(int[] nums) {
        return bs(0,nums.length-1,nums);
        
    }

    public int bs(int l , int r, int[] nums){
        int mid = (l+r)/2;
        if(l==r ) return nums[l];

        else if(nums[mid]>nums[r]){
            return bs(mid+1,r,nums);
        }

        return bs(l,mid,nums);
    
    }
}
