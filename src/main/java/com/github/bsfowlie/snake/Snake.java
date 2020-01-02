package com.github.bsfowlie.snake;

import java.util.LinkedList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;

public class Snake {

    private final List<Point2D> body;

    private Point2D head;
    private Point2D previousTail;

    private Direction direction;

    public Snake(final Point2D position) {

        this.head = position;
        this.body = new LinkedList<>();
        this.body.add(this.head);

    }

    public Point2D position() {

        return head;

    }

    public List<Point2D> body() {

        return body;

    }

    public void move(final Direction direction) {

        this.direction = direction;

    }

    public void update() {

        head = head.add(direction.velocity());
        previousTail = body.remove(body.size() - 1);
        body.add(0, head);

    }

    public boolean collidesWith(final Food food) {

        return head.equals(food.position());

    }

    public void grow() {

        body.add(previousTail);

    }

    public boolean isDead() {

        return body.lastIndexOf(head) > 0;

    }

    public boolean inBounds(final Rectangle boundary) {

        return true;

    }

}
