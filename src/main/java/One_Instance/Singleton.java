package One_Instance;

public class Singleton {
    public static void main(String[] args) {

    }
}

/**
 * 饿汉式实现
 */
class Singleton1{
    private static Singleton1 instance=new Singleton1();
    private Singleton1(){
        if(instance!=null){//防止反射
            throw new RuntimeException("单例对象不能被重复创建");
        }
        System.out.println("饿汉式实现");
    }
    public static Singleton1 getInstance(){
        return instance;
    }
    public Object readResolve(){//防止反序列化
        return instance;
    }
}

/**
 * 枚举式饿汉式实现
 */
enum Singleton2{
    instance;
    private Singleton2(){
        System.out.println("枚举饿汉式实现");
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}

/**
 * 懒汉式实现
 */
class Singleton3{
    private static Singleton3 instance=null;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
/**
 * 懒汉式双重双检索
 */
class Singleton4{
    private static volatile Singleton4 instance=null;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance==null){
            synchronized (Singleton4.class){
                if(instance==null){
                    instance=new Singleton4();
                }
            }
        }
        return instance;
    }
}

/**
 * 懒汉式内部类实现
 */
class Singleton5{
    private static class Holder{
        static Singleton5 instance=new Singleton5();
    }
    private Singleton5(){}
    public static Singleton5 getInstance(){
        return Holder.instance;
    }
}