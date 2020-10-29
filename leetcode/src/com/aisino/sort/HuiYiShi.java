package com.aisino.sort;

/**
 * 给定一个会议时间安排的数组，每个会议时间都会包括开始和结束的时间 [[s1,e1],[s2,e2],…] (si < ei)，为避免会议冲突，同时要考虑充分利用会议室资源，请你计算至少需要多少间会议室，才能满足这些会议安排。
 *
 * 示例 1:
 *
 * 输入: [[0, 30],[5, 10],[15, 20]]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [[7,10],[2,4]]
 * 输出: 1
 *
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-20-下午 1:51
 */

import java.util.Arrays;
import java.util.PriorityQueue;

/**思路---排序或者贪心算法
   * 复杂度
   * 时间 O(NlogN) 空间 O(1)
   * 思路
   * 这题和Merge Intervals很像，我们按开始时间把这些Interval都给排序后，
   * 就挨个检查是否有冲突就行了。有冲突的定义是开始时间小于之前最晚的结束时间。
   * 这里之前最晚的结束时间不一定是上一个的结束时间，所以我们更新的时候要取最大值。
   */
public class HuiYiShi {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0)
            return 0;
        int[] start = new int[intervals.length];
        int[] end = new int [intervals.length];
        for(int i = 0; i < intervals.length; i ++) {
            start[i] = intervals[i][0];
            System.out.println(start[i]);
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        PriorityQueue<Integer> pq = new PriorityQueue<>(end.length);
        pq.add(end[0]);
        for(int i = 1; i < end.length; i ++) {
            if(start[i] >= pq.peek())
                pq.poll();
            pq.add(end[i]);
        }
        return pq.size();
    }
}
