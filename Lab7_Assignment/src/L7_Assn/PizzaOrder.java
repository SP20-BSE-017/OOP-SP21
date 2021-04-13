package L7_Assn;

public class PizzaOrder {
    private Pizza item1;
    private Pizza item2;
    private Pizza item3;
    private int orderItems = 0;

    public PizzaOrder(Pizza p1){
        item1 = p1;
        orderItems = 1;
    }
    public PizzaOrder(Pizza p1, Pizza p2){
        item1 = p1;
        item2 = p2;
        orderItems = 2;
    }
    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3){
        item1 = p1;
        item2 = p2;
        item3 = p3;
        orderItems = 3;
    }
    public double calcTotal(){
        double total = 0;
        if (orderItems == 1){
            total = item1.calcCost();
        }
        else if (orderItems == 2){
            total = item1.calcCost() + item2.calcCost();
        }
        else if (orderItems == 3){
            total = item1.calcCost() + item2.calcCost() + item3.calcCost();
        }
        else{
            System.out.println("Max 3 items are allowed per order.");
        }
        return total;
    }
}
