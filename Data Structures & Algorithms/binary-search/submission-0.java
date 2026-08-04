class Solution {
    public int search(int[] nums, int target) {
        int i =0; 
        int j=nums.length -1;

        while (i<=j)
        {
            int mid = (i+j)/2;
            int nummid = nums[mid];
            if (nummid==target) return mid;
            else if(nummid>target){
                j--;
            }
            
            else{
                i++;
            }
        }

        return -1;
    }
}
