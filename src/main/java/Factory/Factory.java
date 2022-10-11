package Factory;

public class Factory {
    public static void main(String[] args) {
        FactoryR factoryR = new FactoryR();
        FactoryS factoryS = new FactoryS();
        Shape shap1 = factoryR.createShap();
        shap1.draw();
        Shape shap2 = factoryS.createShap();
        shap2.draw();
    }
}

interface Shape{
    void draw();
}

class Retangle implements Shape{

    public void draw() {
        System.out.println("Retangle");
    }
}

class Square implements Shape{

    public void draw() {
        System.out.println("Square");
    }
}

interface ItFactory{
    public Shape createShap();
}
class FactoryR implements ItFactory{
    public Shape createShap() {
        return new Retangle();
    }
}
class FactoryS implements ItFactory{
    public Shape createShap() {
        return new Square();
    }
}