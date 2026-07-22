class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> rows = new ArrayList<>();
        List<HashSet<Character>> cols = new ArrayList<>();
        List<HashSet<Character>> boxes = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j] == '.') continue;

                int box = (i/3)*3 + (j/3);
                if(boxes.get(box).contains(board[i][j]))return false;
                else boxes.get(box).add(board[i][j]);

                if(rows.get(i).contains(board[i][j])) return false;
                else rows.get(i).add(board[i][j]);

                if(cols.get(j).contains(board[i][j])) return false;
                else cols.get(j).add(board[i][j]);
            }
        } 
        return true;
    }
}
