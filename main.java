public class main {


    public static boolean  issafe(char board[][], int row, int col){

        // vertical up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
            
        }

        // diagonal left 
        for(int i=row-1, j=col-1; i>=0 && j>=0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }

        }

        // diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;


    }



    public static void printg(char board[][]){

        System.out.println("------------ chess board--------------");

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();

        }

    }



    public static void nqueens( char board[][], int row){
  
        // base case
        if(row == board.length){
           printg(board);
           count ++;
            return;
        }

        //intialization
        
            for(int j=0; j<board.length; j++){

                if(issafe(board, row, j)){
                    board[row][j] = 'Q';
                    if(count==1){
                        return;
                    }
                    nqueens( board , row+1);// recursvive fun
                    board[row][j] = 'x'; // backtrack
                }

                
    
             }
         }



    
               static int count = 0;
    public static void main(String[]args){

        int n= 5;
        char board [] [] = new char[n][n];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }

        nqueens( board , 0);

        //System.out.println(count);
    }

}
