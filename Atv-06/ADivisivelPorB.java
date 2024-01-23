// Crie um arquivo chamado ADivisivelPorB.java.
// Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, informados pelo usuário.
// O valor de 'a' deve estar na faixa de 0 a 1000 (inclusos), e o valor de 'b' deve estar na faixa de 0 a 20 (inclusos).
// Valide os valores digitados pelo usuário, informando caso não sejam válidos.
// Valide, também, se 1 é maior ou igual ao valor de 'b', caso não seja, informe ao usuário.
// Exiba na saída padrão a mensagem "É divisível" quando 'a' for divisível por 'b' ou a mensagem "Não é divisível" caso contrário.

import java.util.Scanner;
public class ADivisivelPorB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Digite o valor de A: ");
            a = entrada.nextInt();
            System.out.print("\nDigite o valor de B: ");
            b = entrada.nextInt();

            if(a >= 0 && a <= 1000 && b >=0 && b <= 20){
                System.out.println((1 >= b) ? "1 é maior ou igual a B" : "B é menor ou diferente de 1");
                if(a % b == 0){
                    System.out.println("A é divisível");
                } else {
                    System.out.println("Não é divisível");
                }
            } else {
                System.out.println("Digite um valor válido");
            }
        } while (a < 0 || a > 1000 || b < 0 || b > 20);
    }
}

