package ru.gb;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    MyArraySizeException(){
        System.out.println("Array.length is not equal to 4");
    }
}
