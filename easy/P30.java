/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        int start = newInterval.start;
        int end = newInterval.end;
        int size = intervals.size();
        if (size == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        else if (start > intervals.get(size - 1).end) {
            intervals.add(newInterval);
            return intervals;
        }
        else if (end < intervals.get(0).start) {
            intervals.add(0, newInterval);
            return intervals;
        }
        for (int i = 0; i < size - 1; i++) {
            if (start >= intervals.get(i).start && end > intervals.get(i).end && end < intervals.get(i + 1).start) {
                intervals.get(i).end = end;
            }
            if (start > intervals.get(i).end && end > intervals.get(i + 1).start) {
                break;
            }
            else if (start == intervals.get(i).end && end == intervals.get(i + 1).start) {
                intervals.add(i, newInterval);
                intervals.remove(i);
                intervals.remove(i + 1);
            }
            else if (start > intervals.get(i).end && end < intervals.get(i + 1).start) {
                intervals.add(i + 1, newInterval);
            }
            else if (start == intervals.get(i).end && end < intervals.get(i + 1).start) {
                intervals.get(i).end = end;
            }
            else if (end == intervals.get(i).start) {
                intervals.get(i).start = start;
            }

        }
        if (start == intervals.get(size - 1).end) {
            intervals.get(size - 1).end = end;
        }
        if (start >= intervals.get(size - 1).start && end > intervals.get(size - 1).end) {
            intervals.get(size - 1).end = end;
        }
        return intervals;
    }
}