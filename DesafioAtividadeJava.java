import java.util.Scanner;

public class DesafioAtividadeJava {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String nomeCompleto;
        String nomeDoCurso;
        int numeroDoPeriodo;
        float valorDaPrimeiraNota;
        float valorDaSegundaNota;
        int quantidadeDeFaltas;
        float mediaFinal;

        System.out.println("Por favor, digite o nome completo: ");
        nomeCompleto = leitor.nextLine();

        System.out.println("Por favor, digite o nome do curso: ");
        nomeDoCurso = leitor.nextLine();

        System.out.println("Qual o período em que está matriculado? ");
        numeroDoPeriodo = leitor.nextInt();

        System.out.println("Qual a primeira nota desse aluno? ");
        valorDaPrimeiraNota = leitor.nextFloat();

        System.out.println("Qual a segunda nota desse aluno? ");
        valorDaSegundaNota = leitor.nextFloat();

        System.out.println("Quantas faltas já foram contabilizadas? ");
        quantidadeDeFaltas = leitor.nextInt();


        mediaFinal = (valorDaPrimeiraNota + valorDaSegundaNota)/2;

        System.out.println("O aluno de nome " + nomeCompleto + " está matriculado no período " + numeroDoPeriodo + " do curso " + nomeDoCurso);
        System.out.println("A sua média final foi de " + mediaFinal + " Com " + quantidadeDeFaltas + " faltas");

    }
}    