package org.example.model.operation;

public class Somar implements IOperation{

    public int calc (int value1, int value2){
        return value1 + value2;
    }

    public Somar clone() {
        try {
            return (Somar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        } 
    }
}
