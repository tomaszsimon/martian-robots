package com.exercise;

import com.exercise.actions.MoveForwardAction;
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

    @Test
    void shouldReturnMoveForwardAction_whenInstructionIsF() {

        //when
        RobotAction result = subject.getAction('F');

        //then
        assertThat(result).isInstanceOf(MoveForwardAction.class);
    }
}