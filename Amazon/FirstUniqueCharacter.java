public class FirstUniqueCharacter {
	public int Solution (String s) {
		int length = s.length();
		int i = 0, j = 1;
		int[] count = new int[10000];
		while (i < length - 1 && j < length) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
			} else {
				j++;
				count[i]++;
			}
		}
		int res = 0;
		for (int k = 0; k < length; k++) {
			if (count[k] == length - 1 - k) {
				res = k;
				break;
			}
			if (k == length - 1) {
				res = -1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		FirstUniqueCharacter fc = new FirstUniqueCharacter();
		System.out.println(fc.Solution(s));
	}
}