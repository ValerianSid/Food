import java.util.ArrayList;

public class Bar extends FoodCompany implements Service{

    ArrayList<String> menu = new ArrayList<>();

    public Bar(String name, int cost) {
        super(name, cost);

        menu.add("Пиво");
        menu.add("Виски");
        menu.add("Водка");
        menu.add("Текила");
    }
    public void cook(String name) {
        if (menu.contains(name)) {
            System.out.println("Приготовить напиток" + name);
        }
        System.out.println("Такого блюда нет");
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
