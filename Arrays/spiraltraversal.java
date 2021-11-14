class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0,down=n-1,left=0,right=m-1;
        int dir=0;
        /* dir = 0 we move from left to right
           dir = 1 move from top to bottom
           dir = 2 move from right to left
           dir = 3 move from bottom to top
        
        */
        ArrayList<Integer> res = new ArrayList<>();
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    res.add(matrix[top][i]);
                }
                top = top+1;
            }
           else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    res.add(matrix[i][right]);
                }
               right = right-1;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    res.add(matrix[down][i]);
                  
                }
                  down=down-1;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top ;i--)
                {
                    res.add(matrix[i][left]);
                    
                }
                left = left+1;
            }
            dir = (dir+1)%4;
        }
        
        return res;
    }
}
