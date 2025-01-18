class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        int i = 0, size = intervals.length;

        //Before
        while (i < size && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        //Overlap 
        while (i < size && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        ans.add(newInterval);

        // After
        while (i < size) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}