package com.exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RobotExecutorTest {

    private RobotExecutor subject = new RobotExecutor(new MarsPlanet(5, 3), new RobotActions());


    @Test
    void executeInstructions() {

        //given
        MarsRobot marsRobot = new MarsRobot(1, 1, "E");
        String instructions = "RFRFRFRF";

        //when
        subject.executeInstructions(marsRobot, instructions);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(new MarsRobot(1, 1, "E"));
    }
}