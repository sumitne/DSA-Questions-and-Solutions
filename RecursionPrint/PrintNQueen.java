package RecursionPrint;

public class PrintNQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] board = new boolean[4][4];
		printQueen(board,0,"");
	}
	static void printQueen(boolean[][] board, int row, String result) {
		
		if(row == board.length) {
			System.out.println(result);
			return ; // base case
		}
	
		for(int col=0;col<board[row].length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col] = true;
				printQueen(board,row+1,result+"{"+(row+1)+"-"+(col+1)+"}");
				board[row][col] = false;
			}
		}
		return;
	}
	private static boolean isSafe(boolean[][] board,int row,int col) {
		
				
				for(int i=row;i>=0;i--) {
					if(board[i][col]==true) return false; // for vertical
				}
				for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
					if(board[i][j]) return false; // for left diagonal
					
				}
				   for(int i=row,j=col;i>=0&&j<board.length;i--,j++){
			            if(board[i][j]) return false;
			        }
				
				return true;
	}
	
	}



