package lesson1;

public class Robot implements Jump, Run{

    @Override
    public void jump() {
        System.out.println("robot jump");
    }

    @Override
    public void run() {
        System.out.println("robot run");
    }
}
