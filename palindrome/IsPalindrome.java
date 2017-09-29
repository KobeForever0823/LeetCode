import java.util.*;

public class IsPalindrome {
	public boolean solution(String s) {
		if (s.length() == 0) return true;
		int length = s.length();
		s = s.toLowerCase();
		int i = 0, j = length - 1;
		while (i < j) {
			if ((s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
				i++;
				continue;
			}
			if ((s.charAt(j) < 'a' || s.charAt(j) > 'z') && (s.charAt(j) < '0' || s.charAt(j) > '9')) {
				j--;
				continue;
			}
			if ((s.charAt(i) + 32 - 'a') % 32 != (s.charAt(j) + 32 - 'a') % 32) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "aa";
		IsPalindrome ip = new IsPalindrome();
		System.out.println(ip.solution(s));
	}
}