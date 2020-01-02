package com.github.bsfowlie.snake;

import javafx.geometry.Point2D;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SnakeShould implements WithAssertions {

    public static final int START_X = 5;

    public static final int START_Y = 5;

    private Snake snake;

    @BeforeEach void setUp() {

        snake = new Snake(new Point2D(START_X, START_Y));

    }

    @Test void move_right() {

        // given
        snake.move(Direction.RIGHT);

        // when
        snake.update();

        // then
        assertThat(snake.position()).isEqualTo(new Point2D(START_X + 1, START_Y));

    }

    @Test void move_down() {

        // given
        snake.move(Direction.DOWN);

        // when
        snake.update();

        // then
        assertThat(snake.position()).isEqualTo(new Point2D(START_X, START_Y + 1));

    }

    @Test void move_left() {

        // given
        snake.move(Direction.LEFT);

        // when
        snake.update();

        // then
        assertThat(snake.position()).isEqualTo(new Point2D(START_X - 1, START_Y));

    }

    @Test void move_up() {

        // given
        snake.move(Direction.UP);

        // when
        snake.update();

        // then
        assertThat(snake.position()).isEqualTo(new Point2D(START_X, START_Y - 1));

    }

}