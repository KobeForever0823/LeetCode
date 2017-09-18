class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<String>();
        int leastSum = Integer.MAX_VALUE;
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < list1.length; i++) m.put(list1[i], i);
        for (int j = 0; j < list2.length; j++) {
            Integer i = m.get(list2[j]);
            if (i != null && i + j <= leastSum) {
                if (i + j < leastSum) {
                    leastSum = i + j;
                    res.clear();
                }
                res.add(list1[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}