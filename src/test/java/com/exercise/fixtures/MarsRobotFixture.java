package com.exercise.fixtures;

import com.exercise.MarsRobot;

public class MarsRobotFixture {

    public static MarsRobot aMarsRobot(String orientation) {
        return new MarsRobot(1, 1, orientation);
    }
}
