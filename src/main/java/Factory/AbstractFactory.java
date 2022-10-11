package Factory;

public class AbstractFactory {
}

//抽象工厂
interface AbFactory{
    Phone createPhone(String param);
    Mask createMak(String param);
}
//具体工厂
class SuperFactory implements AbFactory{

    public Phone createPhone(String param) {
        return new iPhone();
    }

    public Mask createMak(String param) {
        return new N95();
    }
}
interface Phone{}
class iPhone implements Phone{}
interface Mask{}
class N95 implements Mask{}
