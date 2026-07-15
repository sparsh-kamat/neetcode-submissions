class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer>[] buckets =  new List[nums.length+1];
        for(int n: map.keySet()){
            int freq=map.get(n);
            if(buckets[freq]==null) buckets[freq]=new ArrayList<>();
            buckets[freq].add(n);
        }

        int[] ans = new int[k];
        int idx =0;
        for(int i =nums.length ; i >=0;i--){
            if(buckets[i] == null) continue;
            for(int n : buckets[i]){
                ans[idx]=n;
                idx++;
                if(idx==k){return ans;}
            }
        }

        return ans;
    }
}