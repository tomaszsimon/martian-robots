package com.exercise;

import com.exercise.actions.MoveAction;
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

            if (robotAction instanceof MoveAction) {
                if (handleOffGridRobot(marsRobot)) {
                    break;
                }
            }
        }

    }

    boolean handleOffGridRobot(MarsRobot marsRobot) {
        boolean offGrid = false;

        if (marsRobot.getX() > marsPlanet.getX()) {
            marsRobot.setX(marsPlanet.getX());
            marsPlanet.addScent(marsRobot.getX(), marsRobot.getY());
            offGrid = true;
        }

        if (marsRobot.getY() > marsPlanet.getY()) {
            marsRobot.setY(marsPlanet.getY());
            marsPlanet.addScent(marsRobot.getX(), marsRobot.getY());
            offGrid = true;
        }

        if (marsRobot.getX() < 0) {
            marsRobot.setX(0);
            marsPlanet.addScent(marsRobot.getX(), marsRobot.getY());
            offGrid = true;
        }

        if (marsRobot.getY() < 0) {
            marsRobot.setY(0);
            marsPlanet.addScent(marsRobot.getX(), marsRobot.getY());
            offGrid = true;
        }

        if (offGrid) {
            marsRobot.setStatus("LOST");
            return true;
        } else {
            return false;
        }
    }
}
