package com.exercise.actions;

import com.exercise.MarsRobot;

public class MoveForwardAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        String orientation = marsRobot.getOrientation();

        if ("S".equals(orientation)) {
            marsRobot.setY(marsRobot.getY() - 1);
        } else if ("W".equals(orientation)) {
            marsRobot.setX(marsRobot.getX() - 1);
        } else if ("N".equals(orientation)) {
            marsRobot.setY(marsRobot.getY() + 1);
        } else if ("E".equals(orientation)) {
            marsRobot.setX(marsRobot.getX() + 1);
        }
    }
}
