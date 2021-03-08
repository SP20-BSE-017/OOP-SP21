package l2act2;

public class L2Act2 {
    public static void main(String[] args){
        Time t1 = new Time (12,43,56);
        t1.displayTime();
        //Alternatively
        System.out.println(t1.get_hours() + ":" + t1.get_minutes() + ":" + t1.get_seconds());
    }
}
