package com.exercise.actions;

import com.exercise.MarsRobot;

public class RotateRightAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        if ("E".equals(marsRobot.getOrientation())) {
            marsRobot.setOrientation("S");
        } else if ("S".equals(marsRobot.getOrientation())) {
            marsRobot.setOrientation("W");
        } else if ("W".equals(marsRobot.getOrientation())) {
            marsRobot.setOrientation("N");
        } else if ("N".equals(marsRobot.getOrientation())) {
            marsRobot.setOrientation("E");
        }
    }
}
