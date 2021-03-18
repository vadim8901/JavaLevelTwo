package lesson1;

public class Human implements Jump, Run{

    @Override
    public void jump() {
        System.out.println("human jump");
    }

    @Override
    public void run() {
        System.out.println("human run");
    }
}
