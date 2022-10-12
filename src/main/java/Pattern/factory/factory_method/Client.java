package Pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        LattenCoffeeFactory lattenCoffeeFactory = new LattenCoffeeFactory();

        store.setFactory(americanCoffeeFactory);
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());
    }
}
