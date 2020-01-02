package com.github.bsfowlie.snake;

import javafx.geometry.Point2D;

public class Food {

    private Point2D position;

    public Food(final Point2D position) {

        this.position = position;
    }

    public Point2D position() {

        return position;

    }

    public void moveTo(final Point2D newPosition) {

        position = newPosition;

    }

}
