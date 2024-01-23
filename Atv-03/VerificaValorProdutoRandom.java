// Crie um arquivo chamado VerificaValorProdutoRandom.java.

// Gere dois números aleatórios entre 1 e 1000 (inclusos) e atribua às variáveis precoProduto1 e precoProduto2.

// O programa deve exibir a mensagem "O produto 1 é o mais barato" quando o preço do primeiro produto for menor.
// Caso contrário, se o preço do segundo produto for menor, a mensagem "O produto 2 é o mais barato" deve ser exibida.
// Caso contrário, a mensagem "Os preços dos dois produtos são iguais" é que deve ser exibida.

import java.util.Scanner;
public class VerificaValorProdutoRandom {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int precoProduto1 = (int) (Math.random() * 1000) + 1;
        int precoProduto2 = (int) (Math.random() * 1000) + 1;

        if (precoProduto1 > precoProduto2){
            System.out.println("Produto 1 é mais caro que o produto 2");
        } else if(precoProduto1 < precoProduto2){
            System.out.println("Produto 2 é mais caro que o produto 1");
        } else{
            System.out.println("Os preços são iguais");
        }
    }
}

