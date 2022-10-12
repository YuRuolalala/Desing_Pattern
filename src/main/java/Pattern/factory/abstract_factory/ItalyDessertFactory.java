package Pattern.factory.abstract_factory;

public class ItalyDessertFactory implements DessertFactory{
    public Coffee createCoffee() {
        return new LattenCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
