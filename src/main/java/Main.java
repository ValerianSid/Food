import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static final String CAFFE = "Кафе";
    public static final String BAR = "Бар";
    public static final String FOODTRUCK = "Фудтрак";
    public static final String KULINARIYA = "Кулинария";
    public static void main(String[] args) throws NotEnoughChangeException {

        Service caffe = new Caffe(CAFFE);
        Service bar = new Bar(BAR);
        Service foodtruck = new FoodTruck(FOODTRUCK);
        Service kulinariya = new Kulinariaya(KULINARIYA);

        switch (readLine("Введите название заведения")){
            case CAFFE :
                caffe.sell(readLine("Введите название блюда"),Float.parseFloat(readLine("Введите сумму")));
                break;
            case BAR:
                bar.sell(readLine("Введите название блюда"),Float.parseFloat(readLine("Введите сумму")));
                break;
            case FOODTRUCK:
                foodtruck.sell(readLine("Введите название блюда"),Float.parseFloat(readLine("Введите сумму")));
                break;
            case KULINARIYA:
                kulinariya.sell(readLine("Введите название блюда"),Float.parseFloat(readLine("Введите сумму")));
                break;
        }


        ArrayList<Service> services = new ArrayList<Service>();
        services.add(caffe);
        services.add(bar);
        services.add(foodtruck);
        services.add(kulinariya);
    }

    public static String readLine(String text) {
        System.out.println(text);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = new String();
        try {
            s = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Произошла ошибка ввода/вывода");
        }
        return s;
    }
}
