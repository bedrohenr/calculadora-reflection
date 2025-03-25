package org.example.view;

import org.example.dto.RequestDTO;
import org.example.dto.ResponseDTO;
import org.example.model.operation.IOperation;
import org.reflections.Reflections;

import java.util.Scanner;
import java.util.Set;

public class Menu {
    private Set<Class<? extends IOperation>> escolhas;

    public Menu() {
        Reflections reflections = new Reflections("org.example.model.operation"); // Substitua pelo seu pacote

        // Busca todas as classes que implementam a interface IOperation
        this.escolhas = reflections.getSubTypesOf(IOperation.class); // Recebe as classes
    }
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
    public void showIOperationClasses(){
        int i = 1;
        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperation> clazz : this.escolhas) {
            System.out.println(i + " - " + clazz.getSimpleName());
            i++;
        }
    }
    
    public String findSelectedIOperationClasses(int opt){
        int i = 1;
        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperation> clazz : this.escolhas) {
            if(i == opt)
                return clazz.getSimpleName();
            i++;
        }
        return "";
    }

    public void showResult (ResponseDTO responseDTO){
        System.out.println("O Resultado é: "+responseDTO.getResult());
    }


}
