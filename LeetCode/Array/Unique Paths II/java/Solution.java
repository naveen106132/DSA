class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]arr=new int[obstacleGrid.length][obstacleGrid[0].length];
        // fill dp with -1
        for(int i=0;i<obstacleGrid.length;i++) Arrays.fill(arr[i],-1);
        return helper(obstacleGrid,arr,0,0);
    }
    public static int helper(int [][]obstacleGrind,int [][]dp,int row,int col){
            // ig going out of bound
        if(row==obstacleGrind.length||col==obstacleGrind[0].length)return 0;
        // if obstical have 1
        if(obstacleGrind[row][col]==1)return 0;
        //if reach at finish point
        if(row==obstacleGrind.length-1&&col==obstacleGrind[0].length-1)return 1;
    
        
        // if path is already calculated
        if(dp[row][col]!=-1)return dp[row][col];
        //go right
        int right=helper(obstacleGrind,dp,row,col+1);
        int down=helper(obstacleGrind,dp,row+1,col);
        return dp[row][col]=right+down;

    }
}