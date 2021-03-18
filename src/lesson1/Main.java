package lesson1;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.run();
        cat.jump();
        Robot robot = new Robot();
        robot.jump();
        robot.run();
        Human human = new Human();
        human.jump();
        human.run();

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
        Treadmill treadmill = new Treadmill(line);
        System.out.println(treadmill.treadminn());
    }

    public static void testJump(Jump j, int h){
        Wall wall = new Wall(h);
        System.out.println(wall.wall());
    }
}
