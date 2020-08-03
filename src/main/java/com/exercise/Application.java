package com.exercise;

public class Application {

    public static void main(String... args) {
        MarsPlanet marsPlanet = new MarsPlanet(5, 3);
        MarsRobot marsRobot = new MarsRobot(1, 1, "E");
        RobotActions robotActions = new RobotActions();
        RobotExecutor robotExecutor = new RobotExecutor(marsPlanet, robotActions);
        robotExecutor.executeInstructions(marsRobot, "RFRFRFRF");
    }
}
