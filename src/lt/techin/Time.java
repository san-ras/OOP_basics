package lt.techin;

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
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
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
        if (second == 59 && minute == 59 && hour == 23) {
            hour = 0;
            minute = 0;
            second = 0;
        } else if (second == 59 && minute == 59) {
            hour++;
            minute = 0;
            second = 0;
        } else if (second == 0) {
            minute++;
            second = 0;
        } else {
            second++;
        }
        return this;
    }

    public Time previousSecond() {
        if (second == 0 && minute == 0 && hour == 0) {
            hour = 23;
            minute = 59;
            second = 59;
        } else if (second == 0 && minute == 0) {
            hour--;
            minute = 59;
            second = 59;
        } else if (second == 0) {
            minute--;
            second = 59;
        } else {
            second--;
        }
        return this;
    }

}
