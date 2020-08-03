package com.exercise;

import com.exercise.actions.RobotAction;
import com.exercise.actions.RotateRightAction;

public class RobotActions {
    public RobotAction getAction(char instruction) {
        if (instruction == 'R') {
            return new RotateRightAction();
        }
        return null;
    }
}
