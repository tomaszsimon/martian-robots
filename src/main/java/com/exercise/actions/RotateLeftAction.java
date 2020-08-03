package com.exercise.actions;

import com.exercise.MarsRobot;

public class RotateLeftAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        String orientation = marsRobot.getOrientation();

        if ("N".equals(orientation)) {
            marsRobot.setOrientation("W");
        } else if ("S".equals(orientation)) {
            marsRobot.setOrientation("E");
        } else if ("W".equals(orientation)) {
            marsRobot.setOrientation("S");
        } else if ("E".equals(orientation)) {
            marsRobot.setOrientation("N");
        }
    }
}
