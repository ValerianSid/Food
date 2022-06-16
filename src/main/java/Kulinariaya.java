import java.util.ArrayList;

public class Kulinariaya extends FoodCompany implements Service {

    ArrayList<String> menu = new ArrayList<String>();

    public Kulinariaya(String name) {
        super(name);

        menu.add("Смажень");
        menu.add("Пирог");
        menu.add("Чебурек");
        menu.add("Пирожок");
    }
    public void cook(String dishname)  {
        if (this.menu.contains(dishname)) {
            System.out.println("Завернуть" + dishname);
        }
        else{
            throw new DishNotFoundException();
        }
    }

    public void sell(String dishname, float cost) {
        if( cost - 4.75f > 1) {
            System.out.println("Продать " + dishname + " " + "за " + cost);
            cook(dishname);
        }
        else{
            try {
                throw new NotEnoughChangeException();
            } catch (NotEnoughChangeException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
