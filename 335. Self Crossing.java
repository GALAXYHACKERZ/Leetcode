public class Solution {
    public boolean isSelfCrossing(int[] distance) {
        int n = distance.length;
        for (int i = 3; i < n; i++) {
            // Case 1: current line crosses the line 3 steps ahead
            if (distance[i] >= distance[i - 2] &&
                distance[i - 1] <= distance[i - 3]) {
                return true;
            }

            // Case 2: current line crosses the line 4 steps ahead
            if (i >= 4 && distance[i - 1] == distance[i - 3] &&
                distance[i] + distance[i - 4] >= distance[i - 2]) {
                return true;
            }

            // Case 3: current line crosses the line 5 steps ahead
            if (i >= 5 &&
                distance[i - 2] >= distance[i - 4] &&
                distance[i] + distance[i - 4] >= distance[i - 2] &&
                distance[i - 1] <= distance[i - 3] &&
                distance[i - 1] + distance[i - 5] >= distance[i - 3]) {
                return true;
            }
        }
        return false;
    }
}
