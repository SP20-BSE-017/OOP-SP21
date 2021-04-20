package Lab8_Assignment1;

public class Tape extends Publication{
    private int playTime;

    public Tape(String title, int price, int playTime){
        super(title,price);
        this.playTime = playTime;
    }
    public void setPlayTime(int pT){
        playTime = pT;
    }
    public int getPlayTime(){
        return playTime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Play Time: " + getPlayTime() + " minutes");
    }
}
