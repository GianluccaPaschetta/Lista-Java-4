// Crie um arquivo chamado VerificaValorProduto.java.

// Solicite ao usuário que digite os valores para as variáveis precoProduto1 e precoProduto2.

// O programa deve testar o valor digitado pelo usuário para as duas variáveis e, caso não estejam na faixa de 1 até 1000 (inclusos),
// exibir a mensagem "VALOR INVÁLIDO" e finalizar o programa.

// Caso os valores digitados sejam válidos, exibir a mensagem "O produto 1 é o mais barato" quando o preço do primeiro produto for menor.
// Caso contrário, se o preço do segundo produto for menor, a mensagem "O produto 2 é o mais barato" deve ser exibida.
// Caso contrário, a mensagem "Os preços dos dois produtos são iguais" é que deve ser exibida.

import java.util.Scanner;
public class VerificaValorProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o preço do produto 1: ");
        int precoProduto1 = entrada.nextInt();
        System.out.print("Digite o preço do produto 2: ");
        int precoProduto2 = entrada.nextInt();

        if(precoProduto1 > 0 && precoProduto1 <= 1000 && precoProduto2 > 0 && precoProduto2 <= 1000){
            if (precoProduto1 < precoProduto2){
                System.out.println("Produto 1 mais barato que produto 2");
            } else if (precoProduto1 > precoProduto2) {
                System.out.println("Produto 2 mais barato que produto 1");
            } else {
                System.out.println("Os preços dos produtos são iguais");
            }
        } else{
            System.out.println("Digite um valor válido");
        }
    }
}
