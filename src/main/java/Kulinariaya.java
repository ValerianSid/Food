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

    public void sell(String dishname, float cost) throws NotEnoughChangeException {
        if( cost - 4.75f > 1) {
            System.out.println("Продать " + dishname + " " + "за " + 4.75f + " " + "сдача" + " " + (cost - 4.75f));
            cook(dishname);
        }
        else{
                throw new NotEnoughChangeException();
        }

    }
}
