import java.util.ArrayList;

public class Caffe extends FoodCompany implements Service {

    ArrayList<String> menu = new ArrayList<String>();

    public Caffe(String name, int cost) {
        super(name, cost);

        menu.add("Паста");
        menu.add("Пицца");
        menu.add("Суп");
        menu.add("Десерт");
    }

    public void cook(String name) throws DishNotFoundException {
        if (menu.contains(name)) {
            System.out.println("Приготовить блюдо " + name);
        }
        else {
            System.out.println("Такого блюда нет");
        }
    }

    public void sell(String name, int cost) {

        System.out.println("Продать " + name + "за " + cost);

    }
}
