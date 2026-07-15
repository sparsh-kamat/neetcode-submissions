class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int n: map.keySet()){
            q.offer(n);
            if(q.size()>k){
                q.poll();
            }
        }

        int[] ans = new int[k];
        for(int i =0 ; i <k;i++){
            ans[i]=q.poll();
        }

        return ans;
    }
}
