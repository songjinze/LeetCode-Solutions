package queue;

import java.util.Queue;

/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 */
public class NumIslands {
    private int row_c;
    private int column_c;
    public int numIslands(char[][] grid) {
        int res=0;
        row_c=grid.length;
        if(row_c==0){
            return res;
        }
        column_c=grid[0].length;
        for(int n=0;n<row_c;n++){
            for(int m=0;m<column_c;m++){
                if(grid[n][m]=='1') {
                    reverseIsland(grid, n, m);
                    res++;
                }
            }
        }
        return res;
    }
    private void reverseIsland(char[][] grid,int row,int column){
        if(row==-1||row==row_c||column==-1||column==column_c||grid[row][column]=='0') return;
        grid[row][column]='0';
        reverseIsland(grid,row-1,column);
        reverseIsland(grid,row+1,column);
        reverseIsland(grid,row,column-1);
        reverseIsland(grid,row,column+1);
    }
}