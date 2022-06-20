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

    public void cook(String dishname) throws DishNotFoundException {
        if (this.menu.contains(dishname)) {
            System.out.println("Приготовить блюдо " + dishname);
        }
        else{
            throw new DishNotFoundException();
        }
    }

    public void sell(String dishname, float cost) throws NotEnoughChangeException {
        if( cost - 4.75f > 1) {
            cook(dishname);
            System.out.println("Продать " + dishname + " " + "за " + 4.75f + " " + "сдача" + " " + (cost - 4.75f));

        }
        else{
            throw new NotEnoughChangeException();
            }
        }

    public ArrayList<String> getMenu() {
        return menu;
    }
}

