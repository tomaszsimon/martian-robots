package com.exercise.fixtures;

import com.exercise.MarsRobot;

public class MarsRobotFixture {

    public static MarsRobot aMarsRobot(String orientation) {
        return new MarsRobot(1, 1, orientation, "CREATED");
    }

    public static MarsRobot aMarsRobot(int x, int y, String orientation) {
        return new MarsRobot(x, y, orientation, "CREATED");
    }

    public static MarsRobot aLostMarsRobot(int x, int y, String orientation) {
        return new MarsRobot(x, y, orientation, "LOST");
    }
}
