package com.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.stream.Stream;

public class Application {

    public static void main(String... args) throws IOException {
        try (Stream<String> stream = Files.lines(Path.of(args[0]))) {
            Iterator<String> iterator = stream.iterator();
            if (iterator.hasNext()) {
                MarsPlanet marsPlanet = createMarsPlanet(iterator.next());
                RobotActions robotActions = new RobotActions();
                RobotExecutor robotExecutor = new RobotExecutor(marsPlanet, robotActions);
                while (iterator.hasNext()) {
                    String robotPosition = iterator.next();
                    MarsRobot marsRobot = createRobot(robotPosition);

                    String instructions = iterator.next();
                    robotExecutor.executeInstructions(marsRobot, instructions);

                    String emptyLine = iterator.next();

                    System.out.println(marsRobot);
                }
            }
        }
    }

    private static MarsRobot createRobot(String robotPosition) {
        String[] robotPositionArray = robotPosition.split(" ");
        int x = Integer.parseInt(robotPositionArray[0]);
        int y = Integer.parseInt(robotPositionArray[1]);
        String orientation = robotPositionArray[2];
        return new MarsRobot(x, y, orientation, "CREATED");
    }

    private static MarsPlanet createMarsPlanet(String marsPlanetCoordinates) {
        String[] marsPlanetCoordinatesArray = marsPlanetCoordinates.split(" ");
        int x = Integer.parseInt(marsPlanetCoordinatesArray[0]);
        int y = Integer.parseInt(marsPlanetCoordinatesArray[1]);
        return new MarsPlanet(x, y);
    }
}
