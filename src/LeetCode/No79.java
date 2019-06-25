package LeetCode;

public class No79 {
    /**
     * Given a 2D board and a word, find if the word exists in the grid.
     *
     * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
     *
     * Example:
     *
     * board =
     * [
     *   ['A','B','C','E'],
     *   ['S','F','C','S'],
     *   ['A','D','E','E']
     * ]
     *
     * Given word = "ABCCED", return true.
     * Given word = "SEE", return true.
     * Given word = "ABCB", return false.
     */
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean visit[][];
        char[] w = word.toCharArray();
        for(int i = 0 ;i<row; i++){
            for(int j = 0;j<col; j++){
                if(board[i][j] == w[0]){    //搜索条件
                    visit = new boolean[row][col];  //创建新的图来判断是否扫描
                    if(DFS(board,visit,w,0,i,j))
                        return true;
                }
            }
        }
        return false;
    }
    public static Boolean DFS(char[][] board,boolean[][] visit,char[] word,int n,int i ,int j){
        if(n == word.length)
            return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)
            return false;
        if(board[i][j] == word[n] && !visit[i][j])
            visit[i][j] = true;
            n++;
            if(DFS(board,visit,word,n,i+1,j) ||
                    DFS(board,visit,word,n,i,j+1) ||
                    DFS(board,visit,word,n,i-1,j) ||
                    DFS(board,visit,word,n,i,j-1))
                return true;
        visit[i][j] = false;
        return false;
    }

}
