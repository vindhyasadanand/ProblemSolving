/*Program which checks is it possible to solve a sudoku board or not*/
import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		int board[][] = new int[n][n];
		System.out.println("Enter the entries for sudoku board");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				board[i][j] = sc.nextInt();
			}
		}
		System.out.println(sudokusolver(board,n));
	}
   static boolean canPlaceNum(int board[][],int row,int col,int num)
   {
	   //check row clashes
	   if(!isRowSafe(board,row,num))
	   {
		   return false;
	   }
	   if(!isColSafe(board,col,num))
	   {
		   return false;
	   }
	   if(!isBoxSafe(board,row,col,num))
	   {
		   return false;
	   }
	   //if it is satisfying all the constraints we are returning true
	   return true;
	   
   }
	private static boolean isColSafe(int[][] board, int col, int num) 
	{
		for(int i=0;i<board[col].length;i++)
		{
			if(board[i][col]==num)
			{
				return false;
			}
		}
	 return true;
   }
	private static boolean isBoxSafe(int[][] board, int row, int col, int num) 
	{
		//to check in that box if that number is already present
		//first find index of first element in the box
		int n = (int) Math.sqrt(board[row].length);
		int rowstart = (int) (row - row%n);
		int colstart = (int) (col-col%n);
		for(int i=rowstart;i<rowstart+n;i++)
		{
			for(int j=colstart;j<colstart+n;j++)
			{
				if(board[i][j]==num)
				{
					return false;
				}
			}
		}
	       return true;
	}
	private static boolean isRowSafe(int[][] board, int row, int num) 
	{
	    for(int i=0;i<board[row].length;i++)
	    {
	    	if(board[row][i]==num)
	    	{
	    		return false;
	    	}
	    }
	   return true;
    }
	private static boolean sudokusolver(int[][] board,int n) 
	{
		//first find an empty cell in the board and work over it
		//so to find empy cell initially we dont have any empty cell
		int row = -1;
		int col=-1;
		boolean isEmpty = false;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//indicates we found an empty cell
				if(board[i][j]==0)
				{
					row = i;
					col = j;
					isEmpty = true;
					//after getting an empty cell we are storing its row and column value
					//and we are returning
					break;
				}
			}	
				
			
				//if we found an empty cell break from outer for loop also
				if(isEmpty)
				{
					break;
				}
				
		}
			//after traversing through entire board if are not finding any empt cell which indicates we 
			//finished entire board
			//this indicates we completely solved sudoku board and no empty cell exist
			if(!isEmpty)
			{
				return true;
			}
			//if there is empty place in the board we need to place an item from 1 to 9
			for(int num=1;num<=n;num++)
			{
				//we will take one item and check if that item is suitable in that place
				if(canPlaceNum(board,row,col,num))
				{
					board[row][col] = num;
					if(sudokusolver(board,n))
					{
						return true;
					}
					//if we are not able to solve the board by placing this value we are resetting it
					//after placing particular number if we are not able to solve the board we are resetting it
					//and we are trying to find next number
					board[row][col]=0;
				}
			}
		
		//finally if we are not able to solve the board
		return false;
		
		
	}

	

}
