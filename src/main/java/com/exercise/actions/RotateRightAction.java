package com.exercise.actions;

import com.exercise.MarsRobot;

public class RotateRightAction implements RobotAction {
    @Override
    public void execute(MarsRobot marsRobot) {
        if ("E".equals(marsRobot.getOrientation())) {
            marsRobot.setOrientation("S");
        }
    }
}
