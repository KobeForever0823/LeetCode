public class LongestCommonPrefix {
	public String solution(String[] strs) {
		int size = strs.length;   // length of array
		String res = "";
		if (size == 0) return res;
		for (int i = 0; i < strs.charAt(0).length(); i++) {  // length() is length of string
			for (int j = 1; j < strs.size(); j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) return res; // if length of the first string is larger than the left
			}
			res += strs[0].charAt(i);
		}
		return res;
	}

	public static void main(String args[]) {


	}
}