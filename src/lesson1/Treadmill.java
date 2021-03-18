package lesson1;

public class Treadmill {

    private int line;
    public Treadmill(int line) {
        this.line = line;
    }

    public boolean treadminn(){
        if (line > 5){
            return true;
        }
        else{
            return false;
        }
    }
}
