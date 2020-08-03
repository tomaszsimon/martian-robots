package com.exercise;

import com.exercise.actions.RobotAction;
import com.exercise.actions.RotateRightAction;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RobotActionsTest {

    private RobotActions subject = new RobotActions();

    @Test
    void shouldReturnRotateRightAction_whenInstructionIsR() {

        //when
        RobotAction result = subject.getAction('R');

        //then
        assertThat(result).isInstanceOf(RotateRightAction.class);
    }
}