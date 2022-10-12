package Decorator;

public class DecoratorPattern {
}

interface Robot{
    void doSomething();
}
class FirstRobot implements Robot{
    public void doSomething() {
        System.out.println("唱歌");
        System.out.println("对话");
    }
}
class RobotDecorator implements Robot{
    private Robot robot;

    public void DecoratorRobot(Robot robot) {
        this.robot = robot;
    }

    public void doSomething() {
        robot.doSomething();
    }
    public void doMoreThing(){
        System.out.println("跳舞");
    }
}
