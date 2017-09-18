import java.util.*;

public class GroupAnagrams {
	public List<List<String>> solution(String[] strs) {
		if (strs.length == 0) return new ArrayList();
		Map<String, List> res = new HashMap<String, List>();
		for (String str : strs) {
			char[] cs = str.toCharArray();
			Arrays.sort(cs);
			String key = String.valueOf(cs);
			if (!res.containsKey(key)) res.put(key, new ArrayList());
			res.get(key).add(str);
		}
		return new ArrayList(res.values());
	}

	public static void main(String[] args) {
		GroupAnagrams ga = new GroupAnagrams();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(ga.solution(strs));
	}
}