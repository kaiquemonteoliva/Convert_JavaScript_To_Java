package estrutura_de_repeticao;

public class Atvd04 {

    public static void main(String[] args) {
        //Apresente o valor do salário atual e adicione 100 até que chegue em 5000

        int salario = 1000;
        while ( salario < 5000){
            salario += 100;

            System.out.println("O salario ainda e R$" + salario);
        }
        System.out.print("O salario atual e R$" + salario);
    }
}
