package ru.gb;

public class App {


    public static void main(String[] args) throws MyArraySizeException {

        String[][] array = new String[][]{{"a","a","a","a"}, {"b", "b", "b", "b"}, {"c", "c", "c", "c"}, {"d", "d", "d", "d"}, {}};

        checkMethod(array);
    }

    public static void checkMethod(String[][] array) throws MyArraySizeException {

        try {
            if (array.length != 4) throw new MyArraySizeException();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }



    }

}
