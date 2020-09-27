package com.sb.islandExample.service;

import com.sb.islandExample.request.InputRequest;
import org.springframework.stereotype.Component;

@Component
public class IslandService {

    public String getIslandCountByStrategy(InputRequest request) {
        String strategy = request.getStrategy();
        int[][] islandMap = request.getGrid();

        return "Count of Island using strategy " + strategy + " = " + numIslands(islandMap, strategy);
    }

    public int numIslands(int[][] grid, String strategy) {
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;

        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    count++;
                    merge(grid, i, j, strategy);
                }
            }
        }

        return count;
    }

    public void merge(int[][] grid, int i, int j, String strategy){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0||i>=m||j<0||j>=n||grid[i][j]!=1)
            return;

        grid[i][j]=9;

        merge(grid, i-1, j, strategy);
        merge(grid, i+1, j, strategy);
        merge(grid, i, j-1, strategy);
        merge(grid, i, j+1, strategy);

        if(strategy.equalsIgnoreCase("Omni") || strategy.equalsIgnoreCase("OMNIDIRECTIONAL")) {
            merge(grid, i-1, j-1, strategy);
            merge(grid, i+1, j+1, strategy);
            merge(grid, i-1, j+1, strategy);
            merge(grid, i+1, j-1, strategy);
        }
    }
}
