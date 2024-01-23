// Crie um arquivo chamado ADivisivelPorBRandom.java.
// Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente.
// O valor de 'a' deve estar na faixa de 0 a 1000 (inclusos), e o valor de 'b' deve estar na faixa de 0 a 20 (inclusos).
// Exiba na saída padrão a mensagem "É divisível" quando 'a' for divisível por 'b' ou a mensagem "Não é divisível" caso contrário.


public class ADivisivelPorBRandom {
    public static void main(String[] args){
        int a = (int) (Math.random() * 1000) + 1;
        int b = (int) (Math.random() * 20) + 1;

        System.out.println((a % b == 0 ? "É divisível" : "Não é divisível"));
    }
}
