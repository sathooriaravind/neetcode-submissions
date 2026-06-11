class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c: tasks){
            freq[c-'A']++;
        }
        int maxFreq = 0,maxCount=0;
        for(int val: freq){
            if(val == maxFreq)
                maxCount++;
            else if(val > maxFreq){
                maxCount=1;
                maxFreq = val;
            }
        }
        return Math.max(tasks.length, (maxFreq-1)*(n+1)+ maxCount);
    }
}
