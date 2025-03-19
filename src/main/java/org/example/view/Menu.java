package org.example.view;

import org.example.dto.RequestDTO;
import org.example.dto.ResponseDTO;
import org.example.model.operation.IOperation;
import org.reflections.Reflections;

import java.util.Scanner;
import java.util.Set;

public class Menu {
    public RequestDTO show(){
        this.showMenu();
        return this.captureValues();
    }

    private RequestDTO captureValues (){

        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        System.out.println("Informe o primeiro valor:");
        int valor1 = input.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = input.nextInt();

        return new RequestDTO(opcao,valor1,valor2);
    }

    private void showMenu(){

        System.out.println("---->Olá Meu fi!<----");
        System.out.println("Escolha uma das opção:");
        // System.out.println("1 - Somar");
        // System.out.println("2 - Subtrair");
        // System.out.println("3 - Multiplicar");
        // System.out.println("4 - Dividir");
        // System.out.println("5 - Vá embora ...");

        Reflections reflections = new Reflections("org.example.model.operation"); // Substitua pelo seu pacote

        // Busca todas as classes que implementam a interface IOperation
        Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);

        int i = 1;
        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperation> clazz : classes) {
            System.out.println(i++ + " - " + clazz.getSimpleName());
        }

    }

    public void showResult (ResponseDTO responseDTO){
        System.out.println("O Resultado é: "+responseDTO.getResult());
    }


}
