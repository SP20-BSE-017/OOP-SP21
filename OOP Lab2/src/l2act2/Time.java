package l2act2;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }
    public void displayTime(){
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    public int get_hours(){
        return hours;
    }
    public int get_minutes(){
        return minutes;
    }
    public int get_seconds(){
        return seconds;
    }
}
