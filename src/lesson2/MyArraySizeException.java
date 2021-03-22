package lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    private int arr[][];

    public MyArraySizeException(int arr[][]) {
        this.arr = arr;
    }

    public MyArraySizeException(String s) {
        super(s);
    }

    public int[][] getArr() {
        return arr;
    }
}
