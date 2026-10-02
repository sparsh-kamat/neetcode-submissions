class Solution {
    public int search(int[] nums, int target) {
        return bs(0,nums.length-1,nums,target);


    }

     public int bs(int l , int r, int[] nums, int target){
        if (l > r) return -1;

        int mid = l + (r - l) / 2;
        if (nums[mid] == target) return mid;

        else if(nums[mid]>nums[r]){
            if (nums[l] <= target && target < nums[mid]) {
                return bs(l, mid - 1, nums, target);
            }
            return bs(mid + 1, r, nums, target);
        }

        if (nums[mid] < target && target <= nums[r]) {
            return bs(mid + 1, r, nums, target);
        }
        return bs(l, mid - 1, nums, target);
    }
}
