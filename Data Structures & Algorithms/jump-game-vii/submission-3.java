class Solution {
    /*
     * DP approach:
     * reachable[i] represents whether index i can be reached.
     * For each position i containing '0', look backward in the range
     * [i - maxJump, i - minJump]. If any index in that range is reachable,
     * then i is also reachable.
     *
     * Time Complexity: O(n * (maxJump - minJump))
     * Space Complexity: O(n)
     */
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();

        // If the destination itself is blocked, reaching it is impossible.
        if (s.charAt(n - 1) == '1') {
            return false;
        }

        // reachable[i] indicates whether index i can be reached from index 0.
        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        // Initialize all positions that can be reached directly from index 0.
        for (int i = minJump; i <= Math.min(maxJump, n - 1); i++) {
            if (s.charAt(i) == '0') {
                reachable[i] = true;
            }
        }

        // For each position i, check whether any previously reachable index
        // lies within the valid jump range [i - maxJump, i - minJump].
        for (int i = Math.min(maxJump, n - 1) + 1; i < n; i++) {
            if (s.charAt(i) == '0') {
                boolean canReachCurrent = false;

                int index = i - minJump;

                while (index >= Math.max(0, i - maxJump)) {
                    canReachCurrent |= reachable[index];
                    index--;
                }
                reachable[i] = canReachCurrent;
            }
        }
        return reachable[n - 1];
    }
}