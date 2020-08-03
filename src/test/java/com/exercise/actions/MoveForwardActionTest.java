package com.exercise.actions;

import com.exercise.MarsRobot;
import org.junit.jupiter.api.Test;

import static com.exercise.fixtures.MarsRobotFixture.aMarsRobot;
import static org.assertj.core.api.Assertions.assertThat;

class MoveForwardActionTest {

    private MoveForwardAction subject = new MoveForwardAction();

    @Test
    void shouldGoDownBy1_whenOrientationIsSouth() {

        //given
        MarsRobot marsRobot = aMarsRobot(1, 1, "S");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot(1, 0, "S"));
    }

    @Test
    void shouldGoLeftBy1_whenOrientationIsWest() {

        //given
        MarsRobot marsRobot = aMarsRobot(1, 1, "W");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot(0, 1, "W"));
    }

    @Test
    void shouldGoUpBy1_whenOrientationIsNorth() {

        //given
        MarsRobot marsRobot = aMarsRobot(1, 1, "N");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot(1, 2, "N"));
    }

    @Test
    void shouldGoRightBy1_whenOrientationIsEast() {

        //given
        MarsRobot marsRobot = aMarsRobot(1, 1, "E");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot(2, 1, "E"));
    }
}