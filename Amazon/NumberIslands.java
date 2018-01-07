class NumberIslands {
    public int numIslands(char[][] grid) {
        if (grid.length < 1) return 0;
        int row = grid.length, col = grid[0].length;
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    disapperingIslands(grid, i, j);
                }
            }
        }
        return res;
    }

    public void disapperingIslands(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1) return;
        if (j < 0 || j > grid[0].length - 1) return;
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            disapperingIslands(grid, i - 1, j);
            disapperingIslands(grid, i, j + 1);
            disapperingIslands(grid, i + 1, j);
            disapperingIslands(grid, i, j - 1);
        }
    }

}