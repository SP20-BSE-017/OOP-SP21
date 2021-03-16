package l4assn1;

public class HotDogStand {
    private int StandID;
    private int SoldToday;

    HotDogStand(){
        this(1,0);
    }
    HotDogStand(int sid, int st){
        StandID = sid;
        SoldToday = st;
    }

    void justSold(){
        SoldToday += 1;
    }

    int getSoldToday(){
        return SoldToday;
    }
}
