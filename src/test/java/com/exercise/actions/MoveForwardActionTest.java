package com.exercise.actions;

import com.exercise.MarsRobot;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveForwardActionTest {

    private MoveForwardAction subject = new MoveForwardAction();

    @Test
    void shouldGoDownBy1_whenOrientationIsSouth() {

        //given
        MarsRobot marsRobot = new MarsRobot(1, 1, "S");

        //when
        subject.execute(marsRobot);

        //then
        assertThat(marsRobot).isEqualToComparingFieldByField(new MarsRobot(1, 0, "S"));
    }
}