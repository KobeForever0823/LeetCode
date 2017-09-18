import java.util.*;


public class ReverseWords {
	public String solution(String s) {
		if (s.length() == 0) return s;
		String[] strs = s.trim().split("\\s+");
		if (strs.length == 0) return "";
		Stack<String> stack = new Stack<String>();
		for (String str : strs) {
			stack.push(str);
		}
		String res = "";
		while (stack.size() > 1) {
			res += stack.pop() + " ";
		}
		if (stack.peek() != " ") res += stack.pop();
		return res;
	}

	public static void main(String args[]) {
		String s = " 1";
		ReverseWords rw = new ReverseWords();
		System.out.println(rw.solution(s));
	}
}