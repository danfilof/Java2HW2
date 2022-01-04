package ru.gb;

public class MyArrayDataException extends Exception{

    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

        System.out.println(String.format("Wrong data in cell [%d, %d]", i, j));


    }
}
