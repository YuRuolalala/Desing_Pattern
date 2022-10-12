package Pattern.factory.factory_method;

public class LattenCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new LattenCoffee();
    }
}
