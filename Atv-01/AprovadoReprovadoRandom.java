// Crie um arquivo chamado AprovadoReprovadoRandom.java.
// Gere um número aleatório com valores entre 0 e 10 (inclusos) e atribua à variável "nota".
// O programa deve exibir a mensagem "REPROVADO" quando a nota do aluno for menor do que 6
// ou "APROVADO" caso contrário.


public class AprovadoReprovadoRandom {
    public static void main(String[] args) {
        double nota = Math.random() * 11;
        System.out.printf("%.0f%n", nota);

        System.out.println((nota >= 6) ? "Aprovado" : "Reprovado");
    }
}
