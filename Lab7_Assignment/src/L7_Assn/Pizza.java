package L7_Assn;

public class Pizza {
    private String size;
    private int noOfCheeseToppings;
    private int noOfPepperoniToppings;
    private int noOfHamToppings;
    private double cost;

    public Pizza(){
        this("Small",1,1,1);
    }
    public Pizza(String size, int noOfCheeseToppings, int noOfPepperoniToppings, int noOfHamToppings){
        this.size = size;
        this.noOfCheeseToppings = noOfCheeseToppings;
        this.noOfPepperoniToppings = noOfPepperoniToppings;
        this.noOfHamToppings = noOfHamToppings;
    }
    public void setSize(String s){
        size = s;
    }
    public void setNoOfCheeseToppings(int nct){
        noOfCheeseToppings = nct;
    }
    public void setNoOfPepperoniToppings(int npt){
        noOfPepperoniToppings = npt;
    }
    public void setNoOfHamToppings(int nht){
        noOfHamToppings = nht;
    }

    public String getSize(){
        return size;
    }
    public int getNoOfCheeseToppings(){
        return noOfCheeseToppings;
    }
    public int getNoOfPepperoniToppings(){
        return noOfPepperoniToppings;
    }
    public int getNoOfHamToppings(){
        return noOfHamToppings;
    }

    public double calcCost(){
        int sizeCost = 0;
        if (getSize().equals("Small")){
            sizeCost = 10;
        }
        else if(getSize().equals("Medium")){
            sizeCost = 12;
        }
        else if(getSize().equals("Large")){
            sizeCost = 14;
        }
        else{
            System.out.println("Invalid size!!!");
        }
        int priceOfCheeseToppings = 2 * getNoOfCheeseToppings();
        int priceOfPepperoniToppings = 2 * getNoOfPepperoniToppings();
        int priceOfHamToppings = 2 * getNoOfHamToppings();
        cost = sizeCost + priceOfCheeseToppings + priceOfPepperoniToppings + priceOfHamToppings;
        return cost;
    }
    public String getDescription(){
        return "\n\nSize is: " + getSize() + "\t No of cheese toppings: " + getNoOfCheeseToppings() +
                "\t No of pepperoni toppings: " + getNoOfPepperoniToppings() + "\t No of ham toppings: "
                + getNoOfHamToppings();
    }
}