package com.exercise.actions;

import com.exercise.MarsRobot;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateRightActionTest {

    private RotateRightAction subject = new RotateRightAction();

    @Test
    void shouldRotateRightFromEastToSouth() {

        //given
        MarsRobot marsRobot = new MarsRobot(1, 1, "E");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(new MarsRobot(1, 1, "S"));
    }
}