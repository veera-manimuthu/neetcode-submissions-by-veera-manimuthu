class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char val = board[i][j];
                if ('.' != val) {
                    if (!seen.add("i-"+i +" is having val-"+val)
                    || !seen.add("j-"+j + " is having val-"+val)
                    || !seen.add("k-is having val-"+ (i/3) + " l-is having val-" + (j/3) + " val-"+val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
