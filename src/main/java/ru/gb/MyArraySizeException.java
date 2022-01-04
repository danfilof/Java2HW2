package ru.gb;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    MyArraySizeException(){
        System.out.println("Achtung! Array length is not equal to 4!");
    }
}
