package l4assn1;

public class L4Assn1 {
    public static void main(String[] args){
        HotDogStand s1 = new HotDogStand();
        HotDogStand s2 = new HotDogStand(4,10);
        HotDogStand s3 = new HotDogStand(5,25);

        //s1 sells 10 hotdogs, s2 sells 20 more, and s3 sells 5 more
        for (int i = 1; i <= 10; i++){
            s1.justSold();
        }
        for (int i = 1; i <= 20; i++) {
            s2.justSold();
        }
        for (int i = 1; i <= 5; i++) {
            s3.justSold();
        }

        System.out.println("Stand 1 sold: " + s1.getSoldToday() + " hotdogs.");
        System.out.println("Stand 2 sold: " + s2.getSoldToday() + " hotdogs.");
        System.out.println("Stand 3 sold: " + s3.getSoldToday() + " hotdogs.");

    }
}
