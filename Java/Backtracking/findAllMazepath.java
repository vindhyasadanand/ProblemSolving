private static void printMaze(int[][] maze, int n, int x, int y, int[][] path)
	{
		//check valid position or not
		if(x<0||x>=n||y<0||y>=n)
		{
			return;
		}
		//check if we reached the path
		if(x==n-1&&y==n-1)
		{
			path[x][y]=1;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		//check if we come across a wall and also we are visiting a place twice
		if(maze[x][y]==0||path[x][y]==1)
		{
			return;
		}
		path[x][y]=1;
		//to move rightside
		printMaze(maze,n,x,y+1,path);
		//to move leftside
		printMaze(maze,n,x,y-1,path);
		//to move bottom
		printMaze(maze,n,x+1,y,path);
		//to move top
		printMaze(maze,n,x-1,y,path);
		path[x][y]=0;
		
	}
