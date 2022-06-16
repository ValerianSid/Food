import java.util.ArrayList;
import java.util.List;

public class FoodTruck extends FoodCompany implements Service{

    private List<String> menu;
    public FoodTruck(String name) {
        super(name);
        this.menu = new ArrayList<String>();
        menu.add("Хот-дог");
        menu.add("Шаурма");
        menu.add("Блин");
        menu.add("Пицца");
    }
    public void cook(String dishname) {
        if (this.menu.contains(dishname)) {
            System.out.println("Быстро приготовить" + dishname);
        }
        else{
            throw new DishNotFoundException();
        }
    }

    public void sell(String dishname, float cost) throws NotEnoughChangeException {
        if( cost - 4.75f > 1) {
            System.out.println("Продать " + dishname + " " + "за " + 4.75f + " " + "сдача" + " " + (cost - 4.75f));
            cook(dishname);
        }
        else{

                throw new RuntimeException();

        }
    }
}
