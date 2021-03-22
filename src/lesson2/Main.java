package lesson2;


public class Main {
    public static void main(String[] args) {
        int a_arr = 4;
        int b_arr = 4;
        String arr[][] = new String[a_arr][b_arr];
        int i = 0;
        for (int a = 0; a < a_arr; a++){
            for (int b = 0; b < b_arr; b++){
                arr[a][b] = Integer.toString(i);
                i++;
            }
        }

        arr[1][1] = "s";
        arrayMethod(arr, a_arr, b_arr);
    }

    private static void arrayMethod(String[][] arr, int a_arr, int b_arr) throws MyArrayDataException, MyArraySizeException{
        if (arr.length > 4){
            throw new MyArraySizeException("array length " + arr.length);
        }
        int num = 0;
        int sum = 0;
        for (int a = 0; a < a_arr; a++){
            for (int b = 0; b < b_arr; b++){
                try {
                    num = Integer.parseInt(arr[a][b]);
                } catch (MyArrayDataException e){
                    e.printStackTrace();
                    System.out.println("i: " + a_arr + "\nj: " + b_arr + " \nnum: " + num);
                    num = 0;
                }
                sum += num;
            }
        }
        System.out.println(sum);
    }

}

