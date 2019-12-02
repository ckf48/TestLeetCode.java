//给你一个 有序的 不相交区间列表 intervals 和一个要删除的区间 toBeRemoved， intervals 中的每一个区间 intervals[i] = [a, b] 都表示满足 a <= x < b 的所有实数 x 的集合。 
//
// 我们将 intervals 中任意区间与 toBeRemoved 有交集的部分都删除。 
//
// 返回删除所有交集区间后， intervals 剩余部分的 有序 列表。 
//
// 
//
// 示例 1： 
//
// 
//输入：intervals = [[0,2],[3,4],[5,7]], toBeRemoved = [1,6]
//输出：[[0,1],[6,7]]
// 
//
// 示例 2： 
//
// 
//输入：intervals = [[0,5]], toBeRemoved = [2,3]
//输出：[[0,2],[3,5]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= intervals.length <= 10^4 
// -10^9 <= intervals[i][0] < intervals[i][1] <= 10^9 
// 
// Related Topics 数学 Line Sweep


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        int head = toBeRemoved[0];
        int tail = toBeRemoved[1];
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < head && intervals[i][1] >= head && intervals[i][0] <= tail && intervals[i][1] > tail) {
                List<Integer> first = new ArrayList();
                first.add(intervals[i][0]);
                first.add(head);
                result.add(first);

                List<Integer> second = new ArrayList();
                second.add(tail);
                second.add(intervals[i][1]);
                result.add(second);
            } else if (intervals[i][0] < head && intervals[i][1] >= head && intervals[i][1] <= tail) {
                List<Integer> first = new ArrayList();
                first.add(intervals[i][0]);
                first.add(head);
                result.add(first);
            } else if (intervals[i][0] >= head && intervals[i][0] <= tail && intervals[i][1] > tail) {
                List<Integer> second = new ArrayList();
                second.add(tail);
                second.add(intervals[i][1]);
                result.add(second);
            } else if (intervals[i][0] >= head && intervals[i][1] <= tail)
                continue;
            else {
                List<Integer> first = new ArrayList();
                first.add(intervals[i][0]);
                first.add(intervals[i][1]);
                result.add(first);
            }


        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
