package com.neumont.csc150.pong.model;

public class Collision {

	public boolean isCollision(Entity entity1, Entity entity2, Entity entity3) {
		if (checkNorth(entity1, entity3) || checkSouth(entity1, entity2))
			return true;
		else
			return false;
	}

	public boolean checkNorth(Entity entity1, Entity entity3) {
		if (entity1.getY() <= entity3.getY() + entity3.getHeight()) {
			if (entity1.getX() + entity1.getWidth() >= entity3.getX()
					&& entity3.getX() + entity3.getWidth() >= entity1.getX()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public boolean checkSouth(Entity entity1, Entity entity2) {
		if (entity1.getY() + entity1.getHeight() >= entity2.getY()) {
			if (entity1.getX() + entity1.getWidth() >= entity2.getX()
					&& entity2.getX() + entity2.getWidth() >= entity1.getX()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public void checkWest(Entity entity1, Entity entity2) {
	}

	public void checkEast(Entity entity1, Entity entity2) {
	}

	public void setBoundary(int xMax, int yMax, Paddle entity) {
		if (entity.getX() > xMax + 1 || entity.getX() + entity.getWidth() < 10) {
			entity.setDx(0);
		}
	}

	public void setBoundary(int xMax, int yMax, Ball entity) {
		if (entity.getX() > xMax + 1) {
			entity.setDx(entity.getDx() * -1);
		}
		if (entity.getY() > yMax + 1) {
			entity.setDy(entity.getDy() * -1);
		}
	}
	// public void
}
