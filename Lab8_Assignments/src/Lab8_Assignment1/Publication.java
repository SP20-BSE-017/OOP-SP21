package Lab8_Assignment1;

public class Publication {
    private String title;
    private int price;

    public Publication(String title, int price){
        this.title = title;
        this.price = price;
    }

    public void setTitle(String t){
        title = t;
    }
    public void setPrice(int p){
        price = p;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println("\nBook title: " + getTitle() + "\t\tPrice: " + getPrice());
    }
}
