package lesson1;

public class Cat implements Jump, Run{

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }
}
