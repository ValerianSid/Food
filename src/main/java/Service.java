public interface Service {

    void cook(String dishname);


    void sell(String dishname,float cost) throws NotEnoughChangeException;
}
