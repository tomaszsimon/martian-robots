package com.exercise;

import org.junit.jupiter.api.Test;

import static com.exercise.fixtures.MarsRobotFixture.aMarsRobot;
import static org.assertj.core.api.Assertions.assertThat;

class RobotExecutorTest {

    private MarsPlanet marsPlanet = new MarsPlanet(5, 3);

    private RobotExecutor subject = new RobotExecutor(marsPlanet, new RobotActions());

    @Test
    void shouldAddScentAndUpdateRobotStatusAndXCoordinate_whenRobotIsAboveXEdge() {

        //given
        MarsRobot marsRobot = aMarsRobot(marsPlanet.getX() + 1, marsPlanet.getY(), "N");

        //when
        boolean result = subject.handleOffGridRobot(marsRobot);

        //then
        assertThat(result).isTrue();
        assertThat(marsPlanet.hasScent(5, 3)).isTrue();
        assertThat(marsRobot.getStatus()).isEqualTo("LOST");
        assertThat(marsRobot.getX()).isEqualTo(marsPlanet.getX());
    }

    @Test
    void shouldAddScentAndUpdateRobotStatusAndXCoordinate_whenRobotIsBelowXEdge() {

        //given
        MarsRobot marsRobot = aMarsRobot(-1, marsPlanet.getY(), "S");

        //when
        boolean result = subject.handleOffGridRobot(marsRobot);

        //then
        assertThat(result).isTrue();
        assertThat(marsPlanet.hasScent(0, marsRobot.getY())).isTrue();
        assertThat(marsRobot.getStatus()).isEqualTo("LOST");
        assertThat(marsRobot.getX()).isEqualTo(0);
    }

    @Test
    void shouldAddScentAndUpdateRobotStatusAndYCoordinate_whenRobotIsRightOutsideOfYEdge() {

        //given
        MarsRobot marsRobot = aMarsRobot(marsPlanet.getX(), marsPlanet.getY() + 1, "W");

        //when
        boolean result = subject.handleOffGridRobot(marsRobot);

        //then
        assertThat(result).isTrue();
        assertThat(marsPlanet.hasScent(marsRobot.getX(), marsPlanet.getY())).isTrue();
        assertThat(marsRobot.getStatus()).isEqualTo("LOST");
        assertThat(marsRobot.getY()).isEqualTo(marsPlanet.getY());
    }

    @Test
    void shouldAddScentAndUpdateRobotStatusAndYCoordinate_whenRobotIsLeftOutsideOfYEdge() {

        //given
        MarsRobot marsRobot = aMarsRobot(marsPlanet.getX(), -1, "E");

        //when
        boolean result = subject.handleOffGridRobot(marsRobot);

        //then
        assertThat(result).isTrue();
        assertThat(marsPlanet.hasScent(marsRobot.getX(), 0)).isTrue();
        assertThat(marsRobot.getStatus()).isEqualTo("LOST");
        assertThat(marsRobot.getY()).isEqualTo(0);
    }
}