class LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordListSet = new HashSet(wordList);
        if (!wordListSet.contains(endWord)) return 0;
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>();
        HashSet<String> visited = new HashSet<>();
        int result = 2;
        beginSet.add(beginWord);
        endSet.add(endWord);
        wordListSet.remove(beginWord);
        wordListSet.remove(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set<String> tmpSet = beginSet;
                beginSet = endSet;
                endSet = tmpSet;
            }

            Set<String> temp = new HashSet<>();
            for (String word : beginSet) {
                char[] wordArray = word.toCharArray();
                for (int i = 0; i < wordArray.length; i++) {
                    char oldC = wordArray[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        wordArray[i] = c;
                        String newString = String.valueOf(wordArray);

                        if (endSet.contains(newString)) return result;
                        if (!visited.contains(newString) && wordListSet.contains(newString)) {
                            visited.add(newString);
                            temp.add(newString);
                        }
                        wordArray[i] = oldC;
                    }
                }
            }
            beginSet = temp;
            result++;
        }
        return 0;
    }
}