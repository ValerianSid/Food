public class Bar extends FoodCompany implements Service{


    public Bar(String name, int cost) {
        super(name, cost);
    }
    public void cook(String name) {
        System.out.println("Приготовить напиток" + name);
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
