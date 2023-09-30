package estrutura_de_repeticao;

import java.util.Scanner;

public class Atvd03 {

    public static void main(String[] args) {
        //// Faça um programa que receba um número do usuário e continue a pedir o numero se o numero for diferente de 0.

        Scanner numero = new Scanner(System.in);
        int numeroDigitado;
        do {

            System.out.println("Digite um numero para continuar:");
            numeroDigitado = numero.nextInt();

        }while (numeroDigitado != 0);
        System.out.println("Voce digitou o numero 0 para sair");
    }
}
