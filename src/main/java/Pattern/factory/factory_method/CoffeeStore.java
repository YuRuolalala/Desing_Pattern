package Pattern.factory.factory_method;

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMike();
        coffee.addsugar();
        return coffee;
    }
}
