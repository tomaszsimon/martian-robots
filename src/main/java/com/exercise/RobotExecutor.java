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

            if (robotAction instanceof MoveAction) {
                if (doScentCheck(marsRobot)) {
                    continue;
                }
            }

            robotAction.execute(marsRobot);

            if (robotAction instanceof MoveAction) {
                if (handleOffGridRobot(marsRobot)) {
                    break;
                }
            }
        }

    }

    boolean doScentCheck(MarsRobot marsRobot) {
        if (marsRobot.getX() == 0 && "W".equals(marsRobot.getOrientation())) {
            if (marsPlanet.hasScent(marsRobot.getX(), marsRobot.getY())) {
                return true;
            }
        }
        if (marsRobot.getY() == 0 && "S".equals(marsRobot.getOrientation())) {
            if (marsPlanet.hasScent(marsRobot.getX(), marsRobot.getY())) {
                return true;
            }
        }
        if (marsRobot.getY() == marsPlanet.getY() && "N".equals(marsRobot.getOrientation())) {
            if (marsPlanet.hasScent(marsRobot.getX(), marsRobot.getY())) {
                return true;
            }
        }
        if (marsRobot.getX() == marsPlanet.getX() && "E".equals(marsRobot.getOrientation())) {
            if (marsPlanet.hasScent(marsRobot.getX(), marsRobot.getY())) {
                return true;
            }
        }
        return false;
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
