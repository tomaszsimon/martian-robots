package com.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static java.lang.String.format;

@Getter
@Setter
@AllArgsConstructor
public class MarsRobot {
    private int x;
    private int y;
    private String orientation;
    private String status;

    @Override
    public String toString() {
        return format("%d %d %s %s", x, y, orientation, status.equals("LOST") ? status : "");
    }
}
