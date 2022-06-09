import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Service caffe = new Caffe("Паста", 10);
        Service bar = new Bar("Кола", 3);
        Service foodtruck = new FoodTruck("Хот-дог", 5);
        Service kulinariya = new Kulinariaya("Сосиска в тесте", 2);


        ArrayList<Service> services = new ArrayList<Service>();
        services.add(caffe);
        services.add(bar);
        services.add(foodtruck);
        services.add(kulinariya);
    }
}
