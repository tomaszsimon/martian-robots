package com.exercise;

import com.exercise.actions.MoveForwardAction;
import com.exercise.actions.RobotAction;
import com.exercise.actions.RotateLeftAction;
import com.exercise.actions.RotateRightAction;

import static java.lang.String.format;

public class RobotActions {
    public RobotAction getAction(char instruction) {
        if (instruction == 'R') {
            return new RotateRightAction();
        }
        if (instruction == 'F') {
            return new MoveForwardAction();
        }
        if (instruction == 'L') {
            return new RotateLeftAction();
        }
        throw new UnsupportedOperationException(format("Unknown instruction '%s'", instruction));
    }
}
