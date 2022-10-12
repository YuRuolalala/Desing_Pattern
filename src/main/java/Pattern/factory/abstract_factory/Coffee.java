package Pattern.factory.abstract_factory;

public abstract class Coffee {
    public void addsugar(){
        System.out.println("加糖");
    }
    public void addMike(){
        System.out.println("加奶");
    }
    public abstract String getName();
}
