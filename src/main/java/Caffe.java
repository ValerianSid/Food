public class Caffe extends FoodCompany implements Service {


    public Caffe(String name, int cost) {
        super(name, cost);
    }

    public void cook(String name) {
        System.out.println("Приготовить блюдо" + name);
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
