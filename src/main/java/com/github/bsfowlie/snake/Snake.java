package com.github.bsfowlie.snake;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javafx.geometry.Point2D;

public class Snake {

    private final List<Point2D> body;

    private Point2D head;
    private Direction direction;

    public Snake(final Point2D position) {

        this.head = position;
        this.body = new LinkedList<>();
        this.body.add(this.head);

    }

    public Point2D position() {

        return head;

    }

    public Collection<Point2D> body() {

        return body;

    }

    public void move(final Direction direction) {

        this.direction = direction;

    }

    public void update() {

        head = head.add(direction.velocity());
        body.set(0, head);

    }

    public boolean collidesWith(final Food food) {

        return head.equals(food.position());

    }

}
