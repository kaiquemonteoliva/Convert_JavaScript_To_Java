package estrutura_de_condicao;

import java.util.Scanner;

public class Atvd01 {

    public static void main(String[] args) {
        Scanner receberNota = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int primeiraNota = receberNota.nextInt();

        System.out.println("Digite a segunda nota: ");
        int segundaNota = receberNota.nextInt();

        int media = (primeiraNota+segundaNota) / 2;

        if (media >= 6){
            System.out.println("Meus parabens sua nota: " + media);

        }else{
            System.out.println("Voce nao atigiu a media");
        }


    }

}
