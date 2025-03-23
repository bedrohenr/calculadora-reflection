package org.example.controller;

import org.example.dto.RequestDTO;
import org.example.dto.ResponseDTO;
import org.example.factory.Factory;
import org.example.model.Calc;
import org.example.model.CalcX;
import org.example.model.ICalc;
import org.example.model.operation.*;

public class ControllerCalc {

    public ResponseDTO calc(RequestDTO requestDTO) throws Exception{
        int result = 0;
        ICalc calc = null;
        if (requestDTO.getOpcao() == 1){
            calc = new Calc();

        }else {
            calc = new CalcX();
        }


        IOperation operation = null;
        switch (requestDTO.getOpcao()) {
            case 1:
                // operation = new Somar();
                operation = (IOperation) Factory.createInstance("Somar");
                break;
            case 2:
                // operation = new Subtrair();
                operation = (IOperation) Factory.createInstance("Subtrair");
                break;
            case 3:
                // operation = new Multiplicar();
                operation = (IOperation) Factory.createInstance("Multiplicar");
                break;
            case 4:
                // operation = new Dividir();
                operation = (IOperation) Factory.createInstance("Dividir");
                break;
        }
        result = calc.calculation(operation,requestDTO.getValor1(),requestDTO.getValor2());
        return new ResponseDTO(result);

    }
}

