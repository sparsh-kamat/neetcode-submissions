class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> track = new HashSet<>();
        for (int integer : nums){
            if (track.contains(integer)) return true;
            track.add(integer);
        }
        return false;
    }
}