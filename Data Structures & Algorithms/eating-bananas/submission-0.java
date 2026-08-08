class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int rbound = -1;
        for(int banana : piles){
            rbound = Math.max(banana,rbound);
        }

        int lbound =1;
        int mid;
        int ans=0;

        while(lbound<=rbound)
        {
            mid =  (lbound+rbound)/2;
            int timetaken = hours(piles,mid);
             if(timetaken>h){
                lbound= mid+1;
            }
            else if(timetaken<=h) {
                rbound = mid -1;
                ans = mid;
            }
        }
        return ans;
    }

    public int hours(int[] piles, int speed){
        double totalhours=0;

        for(int bana :piles){
            totalhours += Math.ceil((double)bana/speed);
        }
        return (int)totalhours;
    }
}
