package ex1;

public class Rectangle {
private float lenght = 1.0f;
private float width =1.0f;

public Rectangle() {
	
}
public Rectangle(float length, float width) {
	this.lenght = length;
	this.width = width;
}
public  float getLength() {
	return lenght;
}
public void setLength(float length) {
	this.lenght = length;
}
public float getWidth() {
	return width;
}
public void setWidth(float width) {
	this.width = width;
}
public double getArea() {
	return lenght * width;
}
public double getPerimeter() {
	return 2 * ( lenght + width);
}
@Override
public String toString() {
	return "Rectangle[length=" + lenght + ",width="+width;
}
}
