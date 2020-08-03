package com.exercise.actions;

import com.exercise.MarsRobot;

public class MoveForwardAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        if ("S".equals(marsRobot.getOrientation())) {
            marsRobot.setY(marsRobot.getY() - 1);
        }
    }
}
