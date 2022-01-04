package ru.gb;

public class App {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"},};

        try {
            checkMethod(array);
        } catch (MyArrayDataException | MyArraySizeException | NumberFormatException e) {
            System.out.println("Method checkMethod returned an error");
            e.printStackTrace();
        }
    }

    public static int checkMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {
         int count = 0;

        // Task 1
        try {
            if (array.length != 4) throw new MyArraySizeException();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        // Task 2
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("No errors or exceptions");
        return count;
    }

}
