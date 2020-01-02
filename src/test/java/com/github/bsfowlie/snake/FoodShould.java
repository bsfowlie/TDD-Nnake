package com.github.bsfowlie.snake;

import javafx.geometry.Point2D;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FoodShould implements WithAssertions {

    public static final int INITIAL_X = 3;

    public static final int INITIAL_Y = 4;

    private Food food;

    @BeforeEach void setUp() {

        food = new Food(new Point2D(INITIAL_X, INITIAL_Y));

    }

    @Test void have_position() {

        // given

        // when

        // then
        assertThat(food.position()).isEqualTo(new Point2D(INITIAL_X, INITIAL_Y));

    }

    @Test void be_able_to_move_to_new_position() {

        // given

        // when
        food.moveTo(new Point2D(5, 5));

        // then
        assertThat(food.position()).isEqualTo(new Point2D(5,5));
    }

}