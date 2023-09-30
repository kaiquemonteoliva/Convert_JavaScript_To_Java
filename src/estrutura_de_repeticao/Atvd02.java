package estrutura_de_repeticao;

import java.util.Scanner;

public class Atvd02 {

    public static void main(String[] args) {

        Scanner entradaSenha = new Scanner(System.in);


        int senha;
        do {
            System.out.println("Digite sua senha:");
            senha = entradaSenha.nextInt();

            if (senha != 123) {
                System.out.println("Senha incorreta");
            }

        } while (senha != 123);
        System.out.println("Senha correta");
    }


}
