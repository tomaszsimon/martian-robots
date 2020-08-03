package com.exercise;

import com.exercise.actions.RobotAction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RobotExecutor {
    private final MarsPlanet marsPlanet;
    private final RobotActions robotActions;

    public void executeInstructions(MarsRobot marsRobot, String instructions) {

        for (char instruction : instructions.toCharArray()) {
            RobotAction robotAction = robotActions.getAction(instruction);
            robotAction.execute(marsRobot);
        }

    }
}
