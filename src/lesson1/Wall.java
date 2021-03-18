package lesson1;

public class Wall {
    private int h;
    public Wall(int h) {
        this.h = h;
    }

    public boolean wall(){
        if(h > 5){
            return true;
        }
        else {
            return false;
        }
    }
}
