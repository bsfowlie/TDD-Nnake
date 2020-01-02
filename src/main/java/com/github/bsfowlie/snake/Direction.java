package com.github.bsfowlie.snake;

import javafx.geometry.Point2D;

public enum Direction {
    RIGHT(1, 0),
    DOWN(0,1);

    private final Point2D velocity;

    Direction(double x, double y) {
        velocity = new Point2D(x, y);
    }

    public Point2D velocity() {

        return velocity;

    }
}
