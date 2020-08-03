package com.exercise;

import lombok.Getter;

@Getter
public class MarsPlanet {
    private final int x;
    private final int y;
    private final boolean[][] scents;

    public MarsPlanet(int x, int y) {
        this.x = x;
        this.y = y;
        scents = new boolean[x + 1][y + 1];
    }

    public void addScent(int x, int y) {
        scents[x][y] = true;
    }

    public boolean hasScent(int x, int y) {
        return scents[x][y];
    }
}
