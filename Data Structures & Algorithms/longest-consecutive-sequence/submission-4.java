class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        
        HashSet<Integer> set= new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        for(int i : nums){
            if (!set.contains(i-1)){
                int n=1;
                
                int num =i;
                while(set.contains(num+1)){
                    n+=1;
                    num +=1;
                }
                if(n>max) max =n;
            }
                
        }
        
        return max;
    }
}
