package estrutura_de_repeticao;

public class Atvd01 {
    public static void main(String[] args) {
//joptionpanel
        String[] professores = {"Kaique", "Fernando", "Natalia", "Vinicius", "Leandro", "Monteoliva"};

        for (int contador = 0; contador < professores.length; contador++) {

            System.out.println("O indice atual e " + contador);

            if (contador == 0) {
                System.out.println("O número de indice do(a) professor(a)" + professores[contador] + " é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("O numero do indice do(a) professor(a)" + professores[contador] + "e par");

            } else {
                System.out.println("O numero do indice do(a) professor(a)" + professores[contador] + "e impar");
            }
        }
    }
}