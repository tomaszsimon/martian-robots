package com.exercise.actions;

import com.exercise.MarsRobot;

public class RotateRightAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        String orientation = marsRobot.getOrientation();

        if ("E".equals(orientation)) {
            marsRobot.setOrientation("S");
        } else if ("S".equals(orientation)) {
            marsRobot.setOrientation("W");
        } else if ("W".equals(orientation)) {
            marsRobot.setOrientation("N");
        } else if ("N".equals(orientation)) {
            marsRobot.setOrientation("E");
        }
    }
}
