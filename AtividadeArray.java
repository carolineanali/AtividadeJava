import java.util.Scanner;

public class AtividadeArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int maiorValor = 0;
        int menorValor = 0;
        int somaDeTodos = 0;
        int somaDosPares = 0;
        int contador = 0;

        int[] lista = new int[10];

        for(contador = 0; contador < 10; contador++){
            System.out.println("Por favor, digite um número inteiro: ");
            lista[contador] = scanner.nextInt();

            somaDeTodos += lista[contador];

            if(lista[contador] % 2 == 0){
                somaDosPares += lista[contador];
            }

            if(contador == 0){
                maiorValor = lista[contador];
                menorValor = lista[contador];
            } else {
                if(lista[contador] > maiorValor){
                    maiorValor = lista[contador];
                } else if(lista[contador] < menorValor){
                    menorValor = lista[contador];
                }
            }
        }
        System.out.println("O menor valor da sua lista é " + menorValor + ", e o maior valor é " + maiorValor);
        System.out.println("A soma de todos os valores foi de "+ somaDeTodos + ", e a soma dos valores pares foi de " + somaDosPares);

        scanner.close();
    }    
}
