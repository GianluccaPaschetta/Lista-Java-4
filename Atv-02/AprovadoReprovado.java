// Crie um arquivo chamado AprovadoReprovado.java.
// Solicite ao usuário que digite o valor para a variável nota.
// O programa deve testar o valor digitado pelo usuário e, caso não esteja na faixa de 0 até 10 (inclusos),
// exibir a mensagem "VALOR INVÁLIDO" e finalizar o programa.
// Caso o valor digitado seja válido, exibir a mensagem "REPROVADO" quando a nota do aluno for menor do que 6
// ou "APROVADO" caso contrário.

import java.util.Scanner;
public class AprovadoReprovado {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o valor da nota: ");
        float nota = dados.nextFloat();

        if (nota >= 0 && nota <= 10){
            if(nota >= 6){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("VALOR INVALIDO");
        }
    }
}

