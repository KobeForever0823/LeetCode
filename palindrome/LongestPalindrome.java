import java.util.*;

public class LongestPalindrome {
	public int Solution(String s) {
		HashMap<Character, Integer> m = new HashMap<>();
		int res = 0;
		if (s.length() == 0) return res;
		for (int i = 0; i < s.length(); i++) {
			Integer value = m.get(s.charAt(i));
			if (value == null) value = new Integer(0);
			value++;
			m.put(s.charAt(i), value);
		}
		boolean flag = false;
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			int value = entry.getValue();
			if (value % 2 == 0) {
				res += value;
			} else {
				res += value - 1;
				if (!flag) {
					res++;
					flag = true;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "aaabccccdd";
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.Solution(s));
	}
}