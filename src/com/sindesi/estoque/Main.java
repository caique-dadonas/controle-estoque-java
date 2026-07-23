package com.sindesi.estoque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String valor;
        String nome;
        int idade;
        float nota;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        valor = Integer.toString(idade);

        System.out.print("Digite sua nota: ");
        nota = teclado.nextFloat();

        System.out.printf("Olá, meu nome é %s e eu tenho %s anos de idade.\nMinha nota na prova foi: %.2f", nome, idade, nota);



    }
}


