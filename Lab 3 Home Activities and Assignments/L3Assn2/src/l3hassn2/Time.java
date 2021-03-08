package l3hassn2;

public class Time {
    public int seconds;
    public int min;
    public int hr;

    Time(){                     //no argument constructor will set time to 00:00:00/midnight
        seconds = 00;
        min = 00;
        hr = 00;
    }

    Time(int s, int m, int h){
        seconds = checkSec(s);
        min = checkMin(m);
        hr = checkHr(h);
    }

    public int checkSec(int s){
        if (0 <= s & s < 60){
            return s;
        }
        else
            return 0;
    }

    public int checkMin(int m){
        if (0 <= m & m < 60){
            return m;
        }
        else
            return 0;
    }

    public int checkHr(int h){
        if (0 <= h & h < 24){
            return h;
        }
        else
            return 0;
    }

    public void displayTime(){
        System.out.println("The time is set to: " + hr + ":" + min + ":" + seconds);
    }
}
