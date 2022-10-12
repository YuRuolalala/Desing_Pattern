package Pattern.factory.simple_factory;

public class SimpleCoffeeFactory {

    public Coffee orderCoffee(String name) {
        Coffee coffee = null;
        if ("american".equals(name)) {
            coffee = new AmericanCoffee();
        } else if ("latten".equals(name)) {
            coffee = new LattenCoffee();
        } else {
            throw new RuntimeException("抱歉，没有您点的咖啡");
        }
        return coffee;
    }

}
