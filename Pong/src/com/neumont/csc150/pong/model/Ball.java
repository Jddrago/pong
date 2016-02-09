package com.neumont.csc150.pong.model;

public class Ball extends Entity {
	public Ball() {
		setHeight(10);
		setWidth(10);
		setX(245);
		setY(245);
		setDeltaX(0);
		setDeltaY(5);
	}
}
