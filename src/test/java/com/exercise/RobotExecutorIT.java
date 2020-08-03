package com.exercise;

import org.junit.jupiter.api.Test;

import static com.exercise.fixtures.MarsRobotFixture.aLostMarsRobot;
import static com.exercise.fixtures.MarsRobotFixture.aMarsRobot;
import static org.assertj.core.api.Assertions.assertThat;

class RobotExecutorIT {

    private RobotExecutor subject = new RobotExecutor(new MarsPlanet(5, 3), new RobotActions());

    @Test
    void executeInstructions1() {

        //given
        MarsRobot marsRobot = aMarsRobot(1, 1, "E");
        String instructions = "RFRFRFRF";

        //when
        subject.executeInstructions(marsRobot, instructions);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot(1, 1, "E"));
    }

    @Test
    void executeInstructions2() {

        //given
        MarsRobot marsRobot = aMarsRobot(3, 2, "N");
        String instructions = "FRRFLLFFRRFLL";

        //when
        subject.executeInstructions(marsRobot, instructions);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aLostMarsRobot(3, 3, "N"));
    }

    @Test
    void executeInstructions3() {

        //given
        MarsRobot marsRobot = aMarsRobot(0, 3, "W");
        String instructions = "LLFFFLFLFL";

        //when
        subject.executeInstructions(marsRobot, instructions);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot(2, 3, "S"));
    }
}