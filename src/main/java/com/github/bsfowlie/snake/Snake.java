package com.github.bsfowlie.snake;

import javafx.geometry.Point2D;

public class Snake {

    private Point2D head;

    private Direction direction;

    public Snake(final Point2D position) {

        this.head = position;

    }

    public void move(final Direction direction) {

        this.direction = direction;

    }

    public void update() {

        head = head.add(direction.velocity());

    }

    public Point2D position() {

        return head;

    }

}
