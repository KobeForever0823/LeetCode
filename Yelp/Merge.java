import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
	public List<Interval> solution(List<Interval> intervals) {
		List<Interval> res = new ArrayList<Interval>();
		// Arrays.sort(intervals, new Comparator<List<Interval>>() {
		// 	public Integer compare(List<Interval> i1, List<Interval> i2) {
		// 		return Integer.compare(i1.start, i2.start);
		// 	}
		// });
		intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		int s = intervals.get(0).start;
		int e = intervals.get(0).end;
		for (Interval interval : intervals) {
			if (interval.start <= e) {
				e = Math.max(e, interval.end);
			} else {
				res.add(new Interval(s, e));
				s = interval.start;
				e = interval.end;
			}
		}
		res.add(new Interval(s, e));
		return res;
	}

	public static void main(String args[]) {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));
		Merge m = new Merge();
		System.out.println(m.solution(intervals));
	}
}
