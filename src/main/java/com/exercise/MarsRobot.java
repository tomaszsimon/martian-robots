package com.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MarsRobot {
    private int x;
    private int y;
    private String orientation;
    private String status;
}
