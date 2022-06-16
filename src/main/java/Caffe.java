import java.util.ArrayList;

public class Caffe extends FoodCompany implements Service {

    ArrayList<String> menu = new ArrayList<String>();

    public Caffe(String name) {
        super(name);

        menu.add("Паста");
        menu.add("Пицца");
        menu.add("Суп");
        menu.add("Десерт");
    }

    public void cook(String dishname)  {
        if (this.menu.contains(dishname)) {
            System.out.println("Приготовить блюдо " + dishname);
        }
        else{
            throw new DishNotFoundException();
        }
    }

    public void sell(String dishname, float cost) {
        if( cost - 4.75f > 1) {
            cook(dishname);
            System.out.println("Продать " + dishname + " " + "за " + cost);

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
