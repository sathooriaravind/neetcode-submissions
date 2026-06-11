class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize!=0)
            return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(!map.isEmpty()){
            int start = map.firstKey();
            for(int i=0;i<groupSize;i++){
                int val = start + i;
                if(!map.containsKey(val))
                    return false;
                map.put(val,map.get(val)-1);
                if(map.get(val)==0)
                    map.remove(val);
            }
        }
        return true;
    }
}
