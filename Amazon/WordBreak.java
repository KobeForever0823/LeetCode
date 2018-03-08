class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.isEmpty() || s == "") return false;
        Set<String> newDict = new HashSet<String>();
        newDict.addAll(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                dp[i] = dp[j] && newDict.contains(s.substring(j, i));
                if (dp[i]) break;
            }
        }
        return dp[s.length()];
    }
}