package Pattern.factory.simple_factory;



public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.orderCoffee(type);
        coffee.addMike();
        coffee.addsugar();
        return coffee;
    }


}
