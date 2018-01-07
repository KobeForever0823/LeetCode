class MinMutation {
    public int minMutation(String start, String end, String[] bank) {
        int res = 0;
        if (start.equals(end)) return res;

        Set<String> bankSet = new HashSet<String>();
        for (String str : bank) bankSet.add(str);
        char[] geneSet = new char[] {'A', 'G', 'C', 'T'};

        Set<String> visited = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                String headStr = queue.poll();
                size--;
                if (headStr.equals(end)) return res;

                char[] headChar = headStr.toCharArray();
                for (int i = 0; i < headChar.length; i++) {
                    char tmpC = headChar[i];
                    for (char c : geneSet) {
                        headChar[i] = c;
                        String newStr = new String(headChar);
                        if (!visited.contains(newStr) && bankSet.contains(newStr)) {
                            queue.offer(newStr);
                            visited.add(newStr);
                        }
                    }
                    headChar[i] = tmpC;
                }
            }
            res++;
        }
        return -1;
    }
}