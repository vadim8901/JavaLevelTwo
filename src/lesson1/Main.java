package lesson1;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Robot robot = new Robot();
        Human human = new Human();

        Jump[] jumps = {
                new Cat(),
                new Robot(),
                new Human()
        };

        for (Jump j : jumps) {
            testJump(j, 8);
        }

        Run[] runs = {
                new Cat(),
                new Robot(),
                new Human()
        };

        for (Run r : runs) {
            testRun(r, 10);
        }
    }

    public static void testRun(Run r, int line){
        r.run();
        Treadmill treadmill = new Treadmill(line);

    }

    public static void testJump(Jump j, int h){
        j.jump();
        Wall wall = new Wall(h);
    }
}
