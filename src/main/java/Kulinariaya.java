public class Kulinariaya extends FoodCompany implements Service {


    public Kulinariaya(String name, int cost) {
        super(name, cost);
    }
    public void cook(String name) {
        System.out.println("Завернуть" + name);
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
