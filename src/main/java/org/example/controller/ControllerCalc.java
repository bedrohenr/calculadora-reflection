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
        ICalc calc = new Calc();

        IOperation operation = null;
        Factory factory = new Factory();

        operation = (IOperation) factory.getIOperationClassInstance(requestDTO.getChosenClass());

        result = calc.calculation(operation,requestDTO.getValor1(),requestDTO.getValor2());
        return new ResponseDTO(result);

    }
}

