import java.util.ArrayList;

public class FoodTruck extends FoodCompany implements Service{

    ArrayList<String> menu = new ArrayList<>();
    public FoodTruck(String name, int cost) {
        super(name, cost);

        menu.add("Хот-дог");
        menu.add("Шаурма");
        menu.add("Блин");
        menu.add("Пицца");
    }
    public void cook(String name) {
        if (menu.contains(name)) {
            System.out.println("Быстро приготовить" + name);
        }
        System.out.println("Такого блюда нет");
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
