package Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        RobotDecorator decorator = new RobotDecorator();
        FirstRobot robot = new FirstRobot();
        decorator.RobotDecorator(robot);
        decorator.doSomething();
        decorator.doMoreThing();
    }
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

    public void RobotDecorator(Robot robot) {
        this.robot = robot;
    }

    public void doSomething() {
        robot.doSomething();
    }
    public void doMoreThing(){
        System.out.println("跳舞");
    }
}
