import java.util

public class SimplifyPath {
	public String solution(String path) {
		if (path == null || path.length() == 0) return path;
		Stack<String> s = new Stack<String>();
		String[] newStr = path.split("/");

		for (int i = 0; i < newStr.length; i++) {
			if (newStr[i].equals(".") || newStr[i].length() == 0) {
				continue;
			} else if (newStr[i].equals("..")) {
				if (!s.isEmpty()) {
					s.pop();
				}
			} else {
				s.push(newStr[i]);
			}
		}

		//String res = "";
		StringBuilder res = new StringBuilder();
		Stack<String> s1 = new Stack<String>();
		while (!s.isEmpty()) {
			s1.push(s.pop());
		}

		while (!s1.isEmpty()) {
			res.append("/" + s1.pop());
		}

		if (res.length() == 0) {
			res.append("/");
		}
		return res.toString();
	}

}