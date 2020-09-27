package com.sb.islandExample.request;

public class InputRequest {

    private String strategy;
    private int[][] grid;

    public InputRequest() {
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }
}
