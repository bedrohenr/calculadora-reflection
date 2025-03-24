package org.example.model;

import org.example.model.operation.IOperation;

public class CalcCC {
    
    public IOperation comportamento;
    
    public int calculation (int value1, int value2){

        //return operation.comportamento.calc(value1,value2);
        return comportamento.calc(value1, value2);
    }

    public void setComportamento(IOperation comportamento) {
        this.comportamento = comportamento;
    }
}
