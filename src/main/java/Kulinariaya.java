import java.util.ArrayList;

public class Kulinariaya extends FoodCompany implements Service {

    ArrayList<String> menu = new ArrayList<>();

    public Kulinariaya(String name, int cost) {
        super(name, cost);

        menu.add("Смажень");
        menu.add("Пирог");
        menu.add("Чебурек");
        menu.add("Пирожок");
    }
    public void cook(String name) {
        if (menu.contains(name)) {
            System.out.println("Завернуть" + name);
        }
        System.out.println("Такого блюда нет");
    }

    public void sell(String name, int cost) {
        System.out.println("Продать " + name + "за " + cost);

    }
}
