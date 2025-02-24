package ex3;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor với kiểm tra đầu vào
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Kiểm tra và đặt giá trị thời gian
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("Invalid hour!");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("Invalid minute!");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) throw new IllegalArgumentException("Invalid second!");
        this.second = second;
    }

    // Trả về định dạng HH:MM:SS
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Cập nhật thời gian tới giây kế tiếp
    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour = (hour == 0) ? 23 : hour - 1;
        return this;
    }
}

