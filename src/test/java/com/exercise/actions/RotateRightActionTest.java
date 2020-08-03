package com.exercise.actions;

import com.exercise.MarsRobot;
import org.junit.jupiter.api.Test;

import static com.exercise.fixtures.MarsRobotFixture.aMarsRobot;
import static org.assertj.core.api.Assertions.assertThat;

class RotateRightActionTest {

    private RotateRightAction subject = new RotateRightAction();

    @Test
    void shouldRotateRightFromEastToSouth() {

        //given
        MarsRobot marsRobot = aMarsRobot("E");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("S"));
    }

    @Test
    void shouldRotateRightFromSouthToWest() {

        //given
        MarsRobot marsRobot = aMarsRobot("S");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("W"));
    }

    @Test
    void shouldRotateRightFromWestToNorth() {

        //given
        MarsRobot marsRobot = aMarsRobot("W");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("N"));
    }

    @Test
    void shouldRotateRightFromNorthToEast() {

        //given
        MarsRobot marsRobot = aMarsRobot("N");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(aMarsRobot("E"));
    }
}