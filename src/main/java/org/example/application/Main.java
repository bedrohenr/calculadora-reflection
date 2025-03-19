package org.example.application;

import org.example.view.Menu;
import org.example.controller.ControllerCalc;
import org.example.dto.RequestDTO;
import org.example.dto.ResponseDTO;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        RequestDTO requestDTO = menu.show();
        ControllerCalc controllerCalc = new ControllerCalc();
        ResponseDTO responseDTO = controllerCalc.calc(requestDTO);
        menu.showResult(responseDTO);

    }
}