package ex1;

public class Ball {
private float x;
private float y;
private int radius;
private float xDelta;
private float yDelta;

public Ball(float x, float y, int radius, float xDelta, float yDelta) {
	this.x = x;
	this.y = y;
	this.radius =radius;
	this.xDelta = xDelta;
	this.yDelta = yDelta;
}
public float getX() {
	return this.x;
}
public void setX(float x) {
	this.x = x;
}
public void setY(float y) {
	this.y = y;
}
public float getY() {
	return this.y;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public int getRadius() {
	return this.radius ;
}
public float getXDelta() {
	return this.xDelta;
}
public void setXDelta(float xDelta) {
	this.xDelta = xDelta;
}
public float getYDelta() {
	return this.yDelta;
}
public void setYDelta(float yDelta) {
	this.yDelta = yDelta;
}
public void move() {
	this.x += this.xDelta;
	this.y += this.yDelta;
}
public void reflectVertical() {
	this.yDelta = -this.yDelta;
}
public void reflectHorizontal() {
	this.xDelta = -this.xDelta;
}
@Override
public String toString() {
	return "Ball[(" + x + "," + y + "), speed = (" + xDelta + "," + yDelta + ")]";
}
}
