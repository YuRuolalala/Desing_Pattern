package Factory;

public class SimpleFactory {



    public static Product getProduct(String type){
        if("A".equals(type)){
            return new ProductA();
        }else if("B".equals(type)) {
            return new ProductB();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Product product=SimpleFactory.getProduct("A");
            product.print();
        } catch (Exception e) {
            System.out.println("没有这一类产品");
        }
    }

}
abstract class Product{
    public abstract void print();
}

 class ProductA extends Product{

    @Override
    public void print() {
        System.out.println("产品A");
    }
}

 class ProductB extends Product{

    @Override
    public void print() {
        System.out.println("产品B");
    }
}