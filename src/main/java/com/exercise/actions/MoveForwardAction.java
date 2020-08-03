package com.exercise.actions;

import com.exercise.MarsRobot;

public class MoveForwardAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        if ("S".equals(marsRobot.getOrientation())) {
            marsRobot.setY(marsRobot.getY() - 1);
        } else if ("W".equals(marsRobot.getOrientation())) {
            marsRobot.setX(marsRobot.getX() - 1);
        } else if ("N".equals(marsRobot.getOrientation())) {
            marsRobot.setY(marsRobot.getY() + 1);
        } else if ("E".equals(marsRobot.getOrientation())) {
            marsRobot.setX(marsRobot.getX() + 1);
        }
    }
}
