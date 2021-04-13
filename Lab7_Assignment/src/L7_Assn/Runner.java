package L7_Assn;

public class Runner {
    public static void main(String[] args){
        /*
        Pizza test = new Pizza();
        test.setSize("Large");
        test.setNoOfHamToppings(2);
        System.out.println(test.getDescription());
        System.out.println("Cost is " + test.calcCost());
        */
        Pizza p1 = new Pizza("Large",2,2,1);
        Pizza p2 = new Pizza("Medium",3,1,1);
        PizzaOrder order1 = new PizzaOrder(p1,p2);
        System.out.println("Total cost: " + order1.calcTotal());
    }
}
