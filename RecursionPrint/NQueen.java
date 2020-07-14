package RecursionPrint;

public class NQueen {
	public static void main(String [] args) {
		boolean[][] board = new boolean[4][4];
		System.out.print(countNqueen(board,0));
	}
	static int countNqueen(boolean[][] board, int row) {
		if(row == board.length) return 1; // base case
		int count=0;
		for(int col=0;col<board[row].length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col] = true;
				count = count+countNqueen(board,row+1);
				board[row][col] = false;
			}
		}
		return count;
	}
	private static boolean isSafe(boolean[][] board,int row,int col) {
		int tr = row;
		int tc = col;
				
				for(int i=row;i>=0;i--) {
					if(board[i][col]==true) return false; // for vertical
				}
				while(row>0 && col>0) {
					if(board[row-1][col-1]==true) return false; // for left diagonal
					row--;
					col--;
				}
				while(tr>0 && tc<board.length-1) {
					if(board[tr-1][tc+1]==true) return false; // for right diagonal 
					tr--;
					tc++;
				}
				
				return true;
	}
	
	}


