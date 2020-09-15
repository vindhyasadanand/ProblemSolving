import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of maze board");
		int n =3;
		int maze[][] = {{1,1,0},
				{1,1,0},
				{0,1,1}};
		
		System.out.println(findPath(maze,n));

	}

	public static boolean findPath(int[][] maze, int n) 
	{
		//here it is a maze with n cells
	    int path[][] = new int[n][n];
	   
		return  findPath(maze,n,0,0,path);
	    
	    
		
	}

	private static boolean findPath(int[][] maze, int n, int x, int y,int path[][])
	{
		//x y indicates current cell
		//now currently in x=0 and y=0
		//check x and y are within bound
		if(x<0||y>=n||x>=n||y<0)
		{
			//if this condition becomes true means we are outside the bound
			return false;
		}
		//to check if we reached last cell and did we got the path
		if(x==n-1&&y==n-1)
		{
			return true;
		}
		//now we are present in some x and y position
		//when maze[x][y]=0 this indicates that we reached a place
		//from that place further we dont have any path
		//path[x][y]==1 indicates that we are already traversed 
		//if we are already traversed we should not move in that direction
		if(maze[x][y]==0 || path[x][y]==1)
		{
			return false;
		}
		//right
		path[x][y]=1;
		if(findPath(maze,n,x,y+1,path))
		{
			path[x][y]=0;
			return true;
		}
		//left
		if(findPath(maze,n,x,y-1,path))
		{
			path[x][y]=0;
			return true;
		}
	 	//top
		if(findPath(maze,n,x-1,y,path))
		{
			path[x][y]=0;
			return true;
		}
		//down
		if(findPath(maze,n,x+1,y,path))
		{
			path[x][y]=0;
			return true;
		}
		
		return false;
		
		
	}

}
