import java.util.ArrayList;

public class Bar extends FoodCompany implements Service{

    ArrayList<String> menu = new ArrayList<String>();

    public Bar(String name) {
        super(name);

        menu.add("Пиво");
        menu.add("Виски");
        menu.add("Водка");
        menu.add("Текила");
    }
    public void cook(String dishname) {
        if (this.menu.contains(dishname)) {
            System.out.println("Приготовить напиток" + dishname);
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
