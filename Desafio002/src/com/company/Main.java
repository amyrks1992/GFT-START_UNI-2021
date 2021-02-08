package com.company;

public class Main {

    public static void main(String[] args) {
	Funcionario f1 = new Funcionario();
	f1.salario_inicial = 1.000f;
	f1.percentual = 0.12f;
	f1.salario_total = f1.salario_inicial * f1.percentual;
	f1.salario();
    }
}
