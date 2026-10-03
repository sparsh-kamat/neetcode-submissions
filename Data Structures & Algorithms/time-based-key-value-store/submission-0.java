class TimeMap {
    HashMap<String, ArrayList<Entry>> TM;

    class Entry {
        int timestamp;
        String value;

        Entry(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public TimeMap() {
        TM = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TM.putIfAbsent(key, new ArrayList<>());
        TM.get(key).add(new Entry(timestamp, value));
    }

    public String get(String key, int timestamp) {
        ArrayList<Entry> ans = TM.get(key);
        if (ans == null) return "";

        int l = 0;
        int r = ans.size() - 1;
        return bs(l,r,ans,timestamp,"");
    }

    public String bs(int l, int r, ArrayList<Entry> arr, int timestamp, String ans) {
        if(l>r){
            return ans;
        }

        int mid = (l+r)/2;
        if(arr.get(mid).timestamp == timestamp) return arr.get(mid).value;
        if(arr.get(mid).timestamp>timestamp){
           return bs(l,mid-1,arr,timestamp,ans);
        }

        return bs(mid+1,r,arr,timestamp, arr.get(mid).value);

    }
}
