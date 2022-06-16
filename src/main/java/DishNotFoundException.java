public class DishNotFoundException extends RuntimeException{

    public DishNotFoundException() {
        super("Блюдо не найдено");
        System.out.println("Плохой выбор");
    }
}
