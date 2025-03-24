package org.example.model.operation;

public class Multiplicar implements IOperation{

    public int calc (int value1, int value2){
        return value1 * value2;
    }

    public Multiplicar clone() {
        try {
            return (Multiplicar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        } 
    }
}
