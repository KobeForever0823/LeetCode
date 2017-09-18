import java.util.*;

public class LengthOfLongestSubString {
	public int solution(String s) {
		if (s.length() == 0) return 0;
		Set<Character> set = new HashSet<Character>();
		int res = 0, i = 0, j = 0;
		int length = s.length();
		while (i < length && j < length) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				res = Math.max(res, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return res;
	}

	public static void main(String args[]) {
		String s = "bbbbbb";
		LengthOfLongestSubString ls = new LengthOfLongestSubString();
		System.out.println(ls.solution(s));
	}
}