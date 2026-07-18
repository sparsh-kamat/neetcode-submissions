class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int countofzero=0;
        for( int i : nums){
            if (i!=0){prod*=i;}
            else { countofzero++;}
        } 

        int[] ans = new int[nums.length];


        for(int i =0;i<nums.length;i++){
            if(nums[i]==0 && countofzero==1){
                ans[i]=prod;
            }
            else if(nums[i]==0 && countofzero>1){
                ans[i]=0;
            }
            else{
                ans[i]=countofzero > 0 ? 0:prod/nums[i];
            }
        }

        return ans;
    }
}  
