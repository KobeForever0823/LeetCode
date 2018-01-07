class FindCircleNum {
    public int findCircleNum(int[][] M) {
        int length = M.length;
        int[] visited = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] M, int[] visited, int i) {
        for (int k = 0; k < M.length; k++) {
            if (M[i][k] == 1 && visited[k] == 0) {
                visited[k] = 1;
                dfs(M, visited, k);
            }
        }
    }
}