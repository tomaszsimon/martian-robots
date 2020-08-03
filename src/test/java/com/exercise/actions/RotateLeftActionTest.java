package com.exercise.actions;

import com.exercise.MarsRobot;
import org.junit.jupiter.api.Test;

import static com.exercise.fixtures.MarsRobotFixture.aMarsRobot;
import static org.assertj.core.api.Assertions.assertThat;

class RotateLeftActionTest {

    private RotateLeftAction subject = new RotateLeftAction();

    @Test
    void shouldRotateLeftFromNorthToEast() {

        //given
        MarsRobot marsRobot = aMarsRobot("N");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("W"));
    }

    @Test
    void shouldRotateLeftFromWestToSouth() {

        //given
        MarsRobot marsRobot = aMarsRobot("W");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("S"));
    }

    @Test
    void shouldRotateLeftFromSouthToEast() {

        //given
        MarsRobot marsRobot = aMarsRobot("S");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("E"));
    }

    @Test
    void shouldRotateLeftFromEastToNorth() {

        //given
        MarsRobot marsRobot = aMarsRobot("E");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("N"));
    }
}