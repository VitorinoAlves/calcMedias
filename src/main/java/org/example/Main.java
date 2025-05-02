package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiraNota, segundaNota, terceiraNota, quartaNota, media;

        System.out.println("Calculadora de médias");
        System.out.printf("Informe a primeira nota: ");
        primeiraNota = scanner.nextInt();

        System.out.printf("Informe a segunda nota: ");
        segundaNota = scanner.nextInt();

        System.out.printf("Informe a terceira nota: ");
        terceiraNota = scanner.nextInt();

        System.out.printf("Informe a quarta nota: ");
        quartaNota = scanner.nextInt();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

        System.out.println("Sua média é: " + media);

        if (media>=7){
            System.out.println("Aluno Aprovado!");
        } else if (media>=5){
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}