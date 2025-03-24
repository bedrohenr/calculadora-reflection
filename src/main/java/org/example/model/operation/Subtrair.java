package org.example.model.operation;

public class Subtrair implements IOperation{

    public int calc (int value1, int value2){
        return value1 - value2;
    }

    public Subtrair clone() {
        try {
            return (Subtrair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        } 
    }
}
