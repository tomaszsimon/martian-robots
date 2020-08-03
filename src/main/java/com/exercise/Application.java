package com.exercise;

public class Application {

    public static void main(String... args) {
        MarsPlanet marsPlanet = new MarsPlanet(5, 3);
        MarsRobot marsRobot = new MarsRobot(1, 1, "E");
        RobotExecutor robotExecutor = new RobotExecutor(marsPlanet);
        robotExecutor.executeInstructions(marsRobot, "RFRFRFRF");
    }
}
