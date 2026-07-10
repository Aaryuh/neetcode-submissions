class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> temp = new HashSet<>();

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                temp.clear();
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        if(board[k][l]!='.' && temp.contains(board[k][l])){
                            return false;
                        }
                        temp.add(board[k][l]);
                    }
                }
            }
        }

        temp.clear();
        for(int i=0; i<9; i++){
            temp.clear();
            for(int j=0; j<9; j++){
                if(board[i][j] != '.' && temp.contains(board[i][j])){
                    return false;
                }
                temp.add(board[i][j]);
            }
        }
        temp.clear();
        for(int i=0; i<9; i++){
            temp.clear();
            for(int j=0; j<9; j++){
                if(board[j][i] != '.' && temp.contains(board[j][i])){
                    return false;
                }
                temp.add(board[j][i]);
            }
        }

        return true;
    }
}
