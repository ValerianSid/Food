public class DishNotFoundException extends RuntimeException{

    public DishNotFoundException() {
        super("Блюдо не найдено");
    }
}
