class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hm= new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if (board[i][j] == '.') continue;
                if(hm.contains(board[i][j])){
                    return false;
                }
                hm.add(board[i][j]);
            }
            hm.clear();
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if (board[j][i] == '.') continue;
                if(hm.contains(board[j][i])){
                    return false;
                }
                hm.add(board[j][i]);
            }
            hm.clear();
        }
         for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
