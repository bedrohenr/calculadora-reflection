package org.example.dto;

public class RequestDTO {

    public String getChosenClass() {
        return this.chosen_class;
    }

    public void setChosenClass(String chosen_class) {
        this.chosen_class = chosen_class;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    private String chosen_class;
    private int valor1;
    private int valor2;
    public RequestDTO(String chosen_class, int valor1, int valor2) {
        this.chosen_class = chosen_class;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }



}
