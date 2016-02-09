package com.neumont.csc150.pong.model;

public class Entity {
	
	private int x;
	private int y;
	
	private int height;
	private int width;
	
	private int dx;
	private int dy;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDeltaX() {
		return dx;
	}

	public void setDeltaX(int dx) {
		this.dx = dx;
	}

	public int getDeltaY() {
		return dy;
	}

	public void setDeltaY(int dy) {
		this.dy = dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
