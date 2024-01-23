// Crie um arquivo chamado Saudacao.java.
// Implemente um programa em Java que declare uma variável chamada "hora".
// Essa variável deve armazenar a hora do dia.
// Este programa deve exibir a mensagem "Zzzzz" se a hora estiver no intervalo [0, 6],
// "Bom dia" se a hora estiver no intervalo [7, 11],
// "Boa tarde" se a hora estiver no intervalo [12, 17],
// ou "Boa noite" se a hora estiver no intervalo [18, 23].

// Dê ao usuário a opção de informar a hora manualmente ou gerar a hora aleatoriamente,
// sempre fazendo todas as validações necessárias.

import java.util.Scanner;
public class Saudacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora = 1;

        do{
            System.out.print("Deseja inserir a hora manualmente? ");
            char verif = entrada.next().toUpperCase().charAt(0);

            if (verif == 'S'){
                System.out.print("Insira o horário atual: ");
                hora = entrada.nextInt();

                if(hora >= 0 && hora <=23){
                    System.out.println((hora >= 0 && hora <= 6) ? "Zzzzzz" : (hora >= 7 && hora <= 11) ? "Bom dia" : (hora >= 12 && hora <= 17) ? "Boa tarde" : "Boa noite");
                } else {
                    System.out.println("Digite um horário válido");
                    continue;
                }
            } else if(verif == 'N'){
                hora = (int) (Math.random() * 24);
                System.out.println("Horário atual" + hora);
                System.out.println((hora >= 0 && hora <= 6) ? "Zzzzzz" : (hora >= 7 && hora <= 11) ? "Bom dia" : (hora >= 12 && hora <= 17) ? "Boa tarde" : "Boa noite");
            }
        } while (hora < 0 || hora > 24);
    }
}

