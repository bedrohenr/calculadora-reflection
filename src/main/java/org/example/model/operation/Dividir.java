package org.example.model.operation;

public class Dividir implements IOperation, Cloneable{

    public int calc (int value1, int value2){
        if (value2 == 0)  throw new ArithmeticException("xxxx");
        return value1 / value2;
    }

    public Dividir clone() {
        try {
            return (Dividir) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        } 
    }
}
