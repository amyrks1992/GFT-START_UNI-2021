package com.company;

public class Funcionario {
    float salario_inicial;
    float percentual;
    float salario_total;

    void salario(){
        System.out.println(this.salario_inicial * this.percentual);
    }
}
