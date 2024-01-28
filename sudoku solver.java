class sudoku {
    public static boolean isSafe(char[][]board , int row , int col , int i) {
    for(int j = 0 ; j< board.length ;j++) {
        if(board[j][col] == (char)( i + '0')) {
           return false ; 
        }
        if(board[row][j] == (char)( i +'0')) {
            return false ;
        }
    }
    int sr =  3 * (row /3) ;
    int sc =  3 * (col /3)  ;
    for (int j = sr ; j < sr +3 ; j++) {
        for(int k = sc ; k< sc +3 ; k++) {
            if(board[j][k] == (char)( i +'0') ) {
            return false ;
            }
        }
    }
    return true ;
    }
    public static boolean helper ( char[][] board, int row , int col) {
        if(row == board.length) {
            return true ;
        }
        // to iterate 
        int nrow = 0 ;
        int ncol = 0 ;
        if (col != board.length-1 ) {
            nrow = row ;
            ncol = col +1 ;
        }
        else {
            nrow = row +1 ;
            ncol = 0 ;
        }
        // main method
        if (board[row][col] != '.') {
       if( helper(board, nrow, ncol)) {
        return true ; // backtrack ke karan yrh line bhi important hai;; 
       }
        }
        else {
            for (int i = 1 ; i<= 9; i++) {
             if( isSafe (board , nrow , ncol , i)) {
            board[row][col] = (char)(i+'0');
            // major backtrack code | down
            if(helper(board, nrow, ncol)) {
                return true ;
            } else {
                board[nrow][ncol] = '.' ;
            }
             }
            }
            // ek baar value set karke aage jaane par agar false return hua toh hum waapis peeche aakar value change krke phir aage jaaenge jb tak true return nhi ho jaata
        }
        return false ;
    }
    

    
    public static void main(String[] args) {

     char[][]board = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    } ;
    if(helper(board, 0, 0)) {
    for(int i = 0 ; i<board.length ; i++) {
        for (int j = 0 ; j < board.length ; j++) {
            System.out.print(board[i][j]);
        }
        System.out.println();
        
    }
    }
    else {
    System.out.println("The program is not working");
    }
} 
}
