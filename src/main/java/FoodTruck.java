public class FoodTruck extends FoodCompany implements Service{


    public FoodTruck(String name, int cost) {
        super(name, cost);
    }
    public void cook(String name) {
        System.out.println("Быстро приготовить" + name);
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
