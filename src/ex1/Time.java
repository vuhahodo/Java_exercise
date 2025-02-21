package ex1;

public class Time {
private int hour;
private int minute;
private int second;

public Time(int hour, int minute, int second) {
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}
public int getHour() {
	return this.hour;
}
public int getMinute() {
	return this.minute;
}
public int getSecond() {
	return this.second;
}
public void setHour(int hour) {
	if (hour >= 24 || hour < 0) {
		throw new IllegalArgumentException("Hour must be between 0 and 23");
	}
		this.hour = hour;
}
public void setMinute(int minute) {
	if (minute >= 60 || minute < 0) {
		throw new IllegalArgumentException("Minute must be between 0 and 60");
	}
		this.minute = minute;
}
public void setSecond(int Second) {
	if (second >= 60 || second < 0) {
		throw new IllegalArgumentException("Second must be between 0 and 60");
	}
		this.second = second;
}
public void setTime(int hour, int minute, int second) {
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}
@Override 
public String toString() {
	return String.format("%02d:%02d:%02d", hour, minute, second);
}
public Time nextSecond() {
	this.second ++;
	if (second == 60) {
		second = 0;
		this.minute ++;
		if (minute == 60) {
			minute = 0;
			this.hour ++;
			if (hour == 24) {
				hour = 0;
			}
		}
	}
	return new Time(hour,minute,second);
}
public Time previousSecond() {
	this.second --;
	if (second == -1) {
		second = 59;
		this.minute --;
		if (minute == -1) {
			minute = 59;
			this.hour --;
			if (hour == -1) {
				hour = 23;
			}
		}
	}
	return new Time(hour,minute,second);
}
}
