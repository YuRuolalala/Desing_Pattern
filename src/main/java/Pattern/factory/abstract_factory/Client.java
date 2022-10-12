package Pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory=new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();

        AmericanDessertFactory factory1=new AmericanDessertFactory();
        Coffee coffee1 = factory1.createCoffee();
        Dessert dessert1 = factory1.createDessert();

        System.out.println(coffee1.getName());
        dessert1.show();
    }
}
