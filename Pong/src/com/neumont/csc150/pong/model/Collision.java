package com.neumont.csc150.pong.model;

public class Collision {

	public boolean isCollision(Entity e1, Entity e2, Entity e3) {
		if (checkNorth(e1, e3) || checkSouth(e1, e2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNorth(Entity e1, Entity e3) {
		if (e1.getY() <= e3.getY()) {

			if (e1.getX() + e1.getWidth() >= e3.getX() && e3.getX() + e3.getWidth() >= e1.getX()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public boolean checkSouth(Entity e1, Entity e2) {
		if (e1.getY() + e1.getHeight() >= e2.getY()) {

			if (e1.getX() + e1.getWidth() >= e2.getX() && e2.getX() + e2.getWidth() >= e1.getX()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public void checkWest(Entity e1, Entity e2) {
//		don't remember if anything is needed here or not.
	}

	public void checkEast(Entity e1, Entity e2) {

	}

	public void setBoundary(int xMax, int yMax, Paddle entity) {
		if (entity.getX() > xMax + 1 || entity.getX() + entity.getWidth() < 10) {
			entity.setDeltaX(0);
		}
	}

	public void setBoundary(int xMax, int yMax, Ball entity) {
		if (entity.getX() > xMax + 1) {
			entity.setDeltaX(entity.getDeltax() * -1);
		}
		if (entity.getY() > yMax + 1) {
			entity.setDeltaY(entity.getDeltay() * -1);
		}
	}
}
